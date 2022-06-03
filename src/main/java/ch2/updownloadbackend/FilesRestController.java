package ch2.updownloadbackend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/files")
public class FilesRestController {
    @GetMapping()
    public ResponseEntity<List<MyFile>> getFiles() {
        return ResponseEntity.ok(new ArrayList());
    }

    @PostMapping()
    public ResponseEntity<Void> uploadNewFile(@NotNull @RequestParam("file") MultipartFile multipartFile) throws Exception {
        return ResponseEntity.ok().build();
    }
}
