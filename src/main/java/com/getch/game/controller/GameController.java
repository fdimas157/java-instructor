package com.getch.game.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("sapaan")
    public String greetings() {
        int angka = 10;
        if (angka % 2 == 0) {
            return "Ini bilangan genap";
        }
        else {
            return "Ini bilangan ganjil";
        }
    }

    @GetMapping("api")
    public HashMap<String, String> tampilData(){
        HashMap<String, String> wahyuSarutobi = new HashMap<>();
        wahyuSarutobi.put("id","01022111013");
        wahyuSarutobi.put("name","Dimas Sihaloho");
        return wahyuSarutobi;
    }
}
