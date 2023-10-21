package com.itb.ahtstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itb.ahtstore.models.Coffee;
import com.itb.ahtstore.services.CoffeeService;

@Controller
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("kopi")
    public String listCoffe(Model models){
        List<Coffee> coffees = coffeeService.getAllCoffees();
        models.addAttribute("coffees", coffees);
        return "index";
    }
}
