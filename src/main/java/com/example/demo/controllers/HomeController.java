package com.example.demo.controllers;

/**
 * Created by stenpaaro on 22/05/2018.
 */
import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerServiceImpl;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;


/**
 * Created by stenpaaro on 14/03/2018.
 */
@Controller
public class HomeController {

    private final Logger log = LoggerFactory.logger(this.getClass());

    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/login")
    public String login(){
        log.info("login action called..");

        return "login";
    }


    @GetMapping("/")
    public String index(Model model){
        log.info("index action called..");

        model.addAttribute("customer", new Customer());
        return "index";
    }

    @PostMapping("/")
    public String create(@ModelAttribute Customer customer, Model model){
        log.info("create post action called...");

        customerService.save(customer);
        model.addAttribute("customers", customerService.fetchAll());

        return  "redirect:/";
    }

    @GetMapping("/messages")
    public String message(Model model){
        log.info("message action called...");

        List<Customer> customers = customerService.fetchAll();
        model.addAttribute("customers", customers);

        return "messages";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model){
        log.info("delete action called...");

        model.addAttribute("customer", customerService.findById(id));

        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Customer customer, Model model){
        log.info("delete post action called...");

        customerService.delete(customer.getCustomerId());

        model.addAttribute("customers", customerService.fetchAll());

        return  "redirect:/messages";
    }

}
