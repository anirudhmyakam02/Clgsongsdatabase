package com.data.clgsongs.services;

import com.data.clgsongs.DTOs.SongDto;
import com.data.clgsongs.modules.Song;
import com.data.clgsongs.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    private SongRepository songRepository;
    public AdminService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void addNewSong(SongDto songDto) throws Exception {
        Optional<Song> songOptional = songRepository.findByTitle(songDto.getTitle());
        if (songOptional.isPresent()) {
            throw new Exception("A song with the title '" + songDto.getTitle() + "' already exists.\n Please choose a different title.");
        }
        Song newSong = Song.builder()
                .lyrics(songDto.getLyrics())
                .title(songDto.getTitle())
                .language(songDto.getLanguage())
                .build();
        songRepository.save(newSong);
    }
}
