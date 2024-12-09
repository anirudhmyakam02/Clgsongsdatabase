package com.data.clgsongs.services;

import com.data.clgsongs.modules.Student;
import com.data.clgsongs.repositories.StudentRepository;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DataCollectionService {


    private final String uploadDirectory = "D:\\web\\spring\\songs_dataset";

    public void saveUploadedSong(String Language, String songName, MultipartFile file) throws Exception {

        try{
            Path filePath = Paths.get(uploadDirectory + File.separator + songName+".wav");
            Files.createDirectories(filePath.getParent()); // Ensure directory exists
            Files.write(filePath, file.getBytes());
            System.out.println("File "+songName+"uploaded successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
