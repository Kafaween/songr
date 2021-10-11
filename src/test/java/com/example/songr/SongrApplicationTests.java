package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
		Album album= new Album("My Beautiful Dark Twisted Fantasy","kanye west",5,500,"https://upload.wikimedia.org/wikipedia/en/thumb/b/be/MBDTF_ALT.jpg/220px-MBDTF_ALT.jpg");

		album.setTitle("Title");
		assertEquals("Title",album.getTitle());
		album.setArtist("Artist");
		assertEquals("Artist",album.getArtist());
		album.setSongCount(10);
		assertEquals(10,album.getSongCount());
		album.setLength(1000);
		assertEquals(1000 , album.getLength());
	}

}
