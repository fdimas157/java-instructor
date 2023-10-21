package com.itb.ahtstore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itb.ahtstore.models.Coffee;

@Service
public class CoffeeService {
    public List<Coffee> getAllCoffees(){
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(1, "Kapal Terbang", "Arabika",25000L));
        coffees.add(new Coffee(2, "Luwak Black Kopi", "Americano",35000L));
        coffees.add(new Coffee(3, "CBE Jaya", "Latte",15000L));
        coffees.add(new Coffee(4, "Top Wabred", "Banjarno",65000L));
        coffees.add(new Coffee(5, "Sad Day", "Expresso",20000L));
        return coffees;
    }
}
