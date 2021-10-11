package com.example.songr.Repository;

import com.example.songr.model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepositiry extends JpaRepository<Albums,Long> {
}
