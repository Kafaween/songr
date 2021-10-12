package com.example.songr.Repository;

import com.example.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongsRepository extends JpaRepository<Song,Long> {
    List<Song> findAllByAlbum_Title(String title);

}
