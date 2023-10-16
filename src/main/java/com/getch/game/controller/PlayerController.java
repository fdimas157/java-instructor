package com.getch.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.getch.game.model.Player;
import com.getch.game.service.PlayerService;

@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public String listPlayer(Model model) {
        List<Player> players = playerService.getAllPlayer();
        model.addAttribute("players", players);
        // model.addAttribute("task", players);
        return "index";
    }
}
