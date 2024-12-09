package com.data.clgsongs.services;

import com.data.clgsongs.modules.Song;
import com.data.clgsongs.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SongsServices {
    private SongRepository songRepository;
    public SongsServices(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongsByLanguage(String language) {

        language=language.toUpperCase();
        return songRepository.findAllByLanguage(language);
    }


    public void deletesong(String songtitle) throws Exception {
        Song song = songRepository.findByTitle(songtitle).orElse(null);
        if (song != null) {
            songRepository.delete(song);
        }
        else{
            throw new IllegalArgumentException("song not found");
        }
    }
}
