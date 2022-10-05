package com.isystem.demo.services;

import com.isystem.demo.exception.ApiRequestException;
import com.isystem.demo.model.Player;
import com.isystem.demo.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;


    public ResponseEntity<?> newPlayer(Player requestPlayer) {
        if (requestPlayer.getNumber() <= 99) {
            playerRepository.save(requestPlayer);
            return new ResponseEntity<>("Ok, a new Player Added!", HttpStatus.CREATED);
        }else{
            throw new ApiRequestException("Ups, something went wrong! Please check and try again.");
        }
    }

    public ResponseEntity<?> getById(Long id) {
        Optional<Player> optional =  playerRepository.findById(id);
        if (optional.isEmpty()){
            return ResponseEntity.badRequest().body("player with this id not found");
        }
        return ResponseEntity.ok(optional.get());
    }

    public Player update(Player requestPlayer) {
        if (requestPlayer.getNumber() <= 99) {
            return playerRepository.save(requestPlayer);
        }
        return null;
    }

    public void deleteById(Long id) {
        playerRepository.deleteById(id);
    }
}