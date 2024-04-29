import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.Song;
import com.example.song.SongService;

@RestController
public class SongController {
     SongService songService = new SongService();

     @GetMapping("/songs")
     public ArrayList<Song> getSongs() {
          return songService.getSongs();
     }

     @PostMapping("/songs")

     public Song addSong(@RequestBody Song song) {
          return songService.addSong(song);
     }

     @GetMapping("/songs/{songId}")
     public Song getSongById(@PathVariable("songId") int songId) {
          return songService.getSongById(songId);
     }

     @PutMapping("/songs/{songId}")
     public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
          return songService.updateSong(songId, song);
     }

     @DeleteMapping("/songs/{songId}")
     public void deleteSong(@PathVariable("songId") int songId) {
          songService.deleteSong(songId);
     }

}
