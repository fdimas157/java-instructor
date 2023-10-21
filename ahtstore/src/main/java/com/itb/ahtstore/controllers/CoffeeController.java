package com.itb.ahtstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.ahtstore.models.Coffee;
import com.itb.ahtstore.repository.CoffeeRepository;
import com.itb.ahtstore.services.CoffeeService;

@RestController
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping("find-all")
    public Object findAll(){
        return coffeeRepository.findAll();
    }


    // @GetMapping("kopi")
    // public String listCoffe(Model models){
    //     List<Coffee> coffees = coffeeService.getAllCoffees();
    //     models.addAttribute("coffees", coffees);
    //     return "index";
    // }
}
