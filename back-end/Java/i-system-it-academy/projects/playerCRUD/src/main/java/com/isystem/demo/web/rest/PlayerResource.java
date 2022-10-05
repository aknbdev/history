package com.isystem.demo.web.rest;

import com.isystem.demo.model.Player;
import com.isystem.demo.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player")
public class PlayerResource {
    @Autowired
    private PlayerService playerService;
    // |- Create method -|
    @PostMapping
    public Player newPlayer(@RequestBody Player requestPlayer){
       ResponseEntity<?> player = playerService.newPlayer(requestPlayer);
        return requestPlayer;
    }

    // |- Read method -|
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        ResponseEntity<?> player = playerService.getById(id);
        return player;
    }

    // |- Update Player info -|
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Player requestPlayer){
        Player player = playerService.update(requestPlayer);
        if(requestPlayer == null){
            return new ResponseEntity<>("Ups, something went wrong! Please check and try again.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Ok, Player Information is updated.", HttpStatus.OK);
    }

    // |- Delete Player by id -|
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        playerService.deleteById(id);
        return new ResponseEntity<>("Ok, Player deleted.", HttpStatus.OK);
    }
}
