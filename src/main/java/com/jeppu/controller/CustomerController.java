package com.jeppu.controller;

import com.jeppu.model.Customer;
import com.jeppu.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    private String getCustomerForm(){
        return "customer-form";
    }

    @PostMapping(value={"/save"})
    public String saveCustomer(Customer customer){
        //save to db
        return "customer-detail";
    }

    @GetMapping(value="/edit")
    public String editCustomer(Model model){
        Phone phone = new Phone("91", "0824", "2417235");
        Customer customer = new Customer("Sujay", "Jeppu", phone);
        model.addAttribute("customer", customer);
        return "customer-edit";
    }

}
