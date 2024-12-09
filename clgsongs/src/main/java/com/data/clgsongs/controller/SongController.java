package com.data.clgsongs.controller;

import com.data.clgsongs.modules.Song;
import com.data.clgsongs.services.SongsServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/songs")
public class SongController {
    private SongsServices songsServices;
    public SongController(SongsServices songsServices) {
        this.songsServices = songsServices;
    }

    @GetMapping("/languages/{language}")
    public ResponseEntity<?> getAllSongsByLanguage(@PathVariable String language) {
        try{
            List<Song> songs = songsServices.getAllSongsByLanguage(language);
            return ResponseEntity.status(HttpStatus.OK).body(songs);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


    @DeleteMapping("/delete/{songtitle}")
    public ResponseEntity<?> deleteSong(@PathVariable String songtitle) {
        try{
            songsServices.deletesong(songtitle);
            return ResponseEntity.status(HttpStatus.OK).body("Delete song successfully");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
