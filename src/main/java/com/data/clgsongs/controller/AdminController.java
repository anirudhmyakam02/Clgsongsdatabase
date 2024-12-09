package com.data.clgsongs.controller;

import com.data.clgsongs.DTOs.SongDto;
import com.data.clgsongs.modules.Song;
import com.data.clgsongs.repositories.SongRepository;
import com.data.clgsongs.services.AdminService;
import com.data.clgsongs.services.SongsServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService;
    private SongRepository songRepository;
    public AdminController(AdminService adminService, SongRepository songRepository) {
        this.adminService = adminService;
        this.songRepository = songRepository;
    }

    @PostMapping("/addsong")
    public ResponseEntity<?> addNewSong(@RequestBody SongDto songDto){
        try{
            adminService.addNewSong(songDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("The song "+songDto.getTitle()+" added successfully");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
