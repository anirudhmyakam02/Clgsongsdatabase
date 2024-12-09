package com.data.clgsongs.controller;

import com.data.clgsongs.modules.Student;
import com.data.clgsongs.services.DataCollectionService;
import com.data.clgsongs.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    private DataCollectionService dataCollectionService;
    public StudentController(StudentService studentService, DataCollectionService dataCollectionService) {
        this.studentService = studentService;
        this.dataCollectionService = dataCollectionService;
    }

    @PostMapping("/upload/{songtitle}")
    public ResponseEntity<?> upload(@PathVariable String songtitle, @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Uploaded File is empty");
        }

        try{
//            studentService.uploadSong(songtitle,file);
            System.out.println("songtitle"+songtitle);
            studentService.uploadSong(songtitle, file);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Uploaded successfully");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping("/{creds}/upload/{songtitle}")
    public ResponseEntity<?> uploadwithcreds(@PathVariable String creds, @PathVariable String songtitle, @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Uploaded File is empty");
        }

        try{
//            studentService.uploadSong(songtitle,file);
            studentService.uploadSongwithcreds(creds,songtitle, file);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Uploaded successfully");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
