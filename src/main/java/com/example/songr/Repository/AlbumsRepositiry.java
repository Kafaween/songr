package com.example.songr.Repository;

import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepositiry extends JpaRepository<Album,Long> {
    Album deleteAlbumByTitle(String title);
}
