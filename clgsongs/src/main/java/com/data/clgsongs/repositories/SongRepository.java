package com.data.clgsongs.repositories;

import com.data.clgsongs.modules.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SongRepository extends JpaRepository<Song, UUID> {
    Optional<Song> findByTitle(String title);
    List<Song> findAllByLanguage(String language);
}
