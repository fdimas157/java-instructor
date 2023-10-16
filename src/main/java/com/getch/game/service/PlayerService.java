package com.getch.game.service;

import java.util.ArrayList;
import java.util.List;
import com.getch.game.model.Player;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    public List<Player> getAllPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Dimas"));
        players.add(new Player(2, "Wahyu"));
        players.add(new Player(3, "Anggi"));
        return players;
    }
}
