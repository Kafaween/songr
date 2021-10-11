package com.example.songr.controller;
import com.example.songr.Repository.AlbumsRepositiry;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Albums {


@Autowired
    private  AlbumsRepositiry albumsRepositiry;



    //    @GetMapping("/albums")
//    public String album( Model model) {
//        com.example.songr.model.Albums a1=new com.example.songr.model.Albums("My Beautiful Dark Twisted Fantasy","kanye west",5,500,"https://upload.wikimedia.org/wikipedia/en/thumb/b/be/MBDTF_ALT.jpg/220px-MBDTF_ALT.jpg");
//        com.example.songr.model.Albums a2=new com.example.songr.model.Albums("Yeezus ","kanye west",5,50000,"https://upload.wikimedia.org/wikipedia/en/0/03/Yeezus_album_cover.png");
//        com.example.songr.model.Albums a3=new com.example.songr.model.Albums("My asd","kanye west",10,5000,"https://image.shutterstock.com/image-vector/retro-covers-set-colorful-modernism-260nw-465537599.jpg");
//        ArrayList<com.example.songr.model.Albums> albumms= new ArrayList<>();
//        albumms.add(a1);
//        albumms.add(a2);
//        albumms.add(a3);
//        model.addAttribute("album", albumms);
//        return "albums";
//    }
    @GetMapping("/albums")
    public String getBlogAlbums(Model model) {
        model.addAttribute("album", albumsRepositiry.findAll());
        return "albums";
    }
    @PostMapping("/albums")
    public RedirectView createNewAlbums(@ModelAttribute Album album) {
        albumsRepositiry.save(album);
        return new RedirectView("albums");
    }
    @DeleteMapping ("/albums/{title}")
    public RedirectView DeleteAlbums(@PathVariable String title) {
        albumsRepositiry.deleteAlbumByTitle(title);
        return new RedirectView("albums");
    }
}
