package lecture;

import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Files.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.charset.Charset;

public class FileIOLec {
    public static void main(String[] args) throws IOException {
        //example path: "/src/data"

        String currentDirectory = System.getProperty("user.dir");
        String directory = currentDirectory + "/src/data/";
        String fileName = "data.txt";
        Path filepath = Paths.get(directory, fileName);
        System.out.println(filepath);

        //convert charset for UTDF encoding for text file
        Charset charConvert = StandardCharsets.UTF_8;

        if (Files.notExists(Path.of(directory))) {
            Files.createDirectory(Path.of(directory));
        }
        if(! Files.exists(filepath)){
            Files.createFile(filepath);
        }
        //read from data file

        System.out.println("reading data before");
        List<String> data = Files.readAllLines(filepath);

        //reading before
        for(int i =0; i < data.size(); i +=1){
            System.out.println((i+1) + ": " + data.get(i));

        }
        //write
        List<String> lines = Arrays.asList("Test line 1", "Test line 2");

        Files.write(filepath, lines);


        System.out.println("new Lines");

//        Files.write(filepath, lines[, StandardOpenOption option])

    }
}

