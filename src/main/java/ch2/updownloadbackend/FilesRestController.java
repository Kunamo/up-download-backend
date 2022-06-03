package ch2.updownloadbackend;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/files")
public class FilesRestController {
    @GetMapping()
    public ResponseEntity<List<MyFile>> getFiles() {
        //create temp list
        List<MyFile> files = new ArrayList<>();
        File folder = new File("C:\\Users\\elias\\Uploads");
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                //Add file (myFile) to array list
                files.add(new MyFile(file.getName(), file.length(), file.getName().substring(file.getName().lastIndexOf(".") + 1), file.getAbsolutePath()));
            }
        }
        //return temp list
        return ResponseEntity.ok(files);
    }

    @PostMapping()
    public ResponseEntity<Void> uploadNewFile(
            @NotNull @RequestParam("file") MultipartFile multipartFile)
            throws IOException {
        return ResponseEntity.ok().build();
    }
}
