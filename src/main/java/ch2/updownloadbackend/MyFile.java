package ch2.updownloadbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class MyFile {
    private String name;
    private long size;
    private String contentType;
    private String data;
}

