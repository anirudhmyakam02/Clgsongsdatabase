package com.data.clgsongs.services;

import com.data.clgsongs.modules.Song;
import com.data.clgsongs.modules.Student;
import com.data.clgsongs.repositories.SongRepository;
import com.data.clgsongs.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    private SongRepository songRepository;
    private DataCollectionService dataCollectionService;
    public StudentService(StudentRepository studentRepository, SongRepository songRepository, DataCollectionService dataCollectionService) {
        this.studentRepository = studentRepository;
        this.songRepository = songRepository;
        this.dataCollectionService = dataCollectionService;
    }

    public void uploadSong(String songtitle,MultipartFile file) throws Exception{
        Optional<Song> optionalSong = songRepository.findByTitle(songtitle);
//        Song song = optionalSong.orElse(new Song());
        Song song;
        if (optionalSong.isPresent()) {
            song = optionalSong.get();
        }
        else {
//            throw new IllegalArgumentException("Song does not exist");
            song = Song.builder()
                    .title(songtitle)
                    .build();
        }
            String songName;
            if (song.getEntry_count()>Song.entry_limit){
                throw new IllegalArgumentException("Song Responce Limit Reached");
            }
            songName = song.getTitle()+"_subject"+song.getEntry_count();
//            System.out.println("inside the StudentService"+songName);
            String language="dummy";
            dataCollectionService.saveUploadedSong(language, songName, file);
            song.setEntry_count(song.getEntry_count()+1);
            songRepository.save(song);

//        songName = song.getTitle()+"_subject"+song.getEntry_count();
//////            System.out.println("inside the StudentService"+songName);
////
//            dataCollectionService.saveUploadedSong(songName, file);
//            song.setEntry_count(song.getEntry_count()+1);
//            songRepository.save(song);
    }

    public void uploadSongwithcreds(String creds,String songtitle,MultipartFile file) throws Exception{

        String rollno;
        String studentname;
        Student student;
        String credsarray[] = creds.split("-");
        studentname = credsarray[0];
        rollno = credsarray[1];

//        getting the student if exists or else creating new student
        Optional<Student> optionalStudent = studentRepository.findByRollno(rollno);
        student = optionalStudent.orElseGet(() -> Student.builder()
                .rollno(rollno)
                .name(studentname)
                .build());

//        getting the song if exists or returning the error
        Optional<Song> optionalSong = songRepository.findByTitle(songtitle);
        if (optionalSong.isEmpty()) {
            throw new IllegalArgumentException("Song does not exist");
        }
        Song song = optionalSong.get();

//        generating the song name
        String songName;
        if (song.getEntry_count()>Song.entry_limit){        //checking if the entries are in the limit
            throw new IllegalArgumentException("Song Responce Limit Reached");
        }
        songName = song.getTitle()+"_subject"+song.getEntry_count();
        System.out.println("inside the StudentService"+songName);
        String language = String.valueOf(song.getLanguage());
        dataCollectionService.saveUploadedSong(language,songName, file);     //we are savnig the song here

//        updating the entry count
        song.setEntry_count(song.getEntry_count()+1);
        songRepository.save(song);

//        updating the songsuploaded list in student
        List<Song> songsuploaded;
        if (student.getSongsuploded()!=null) {
            songsuploaded = student.getSongsuploded();
        }
        else{
            songsuploaded= new ArrayList<Song>();
        }
        songsuploaded.add(song);
        student.setSongsuploded(songsuploaded);
        studentRepository.save(student);

//        updating the songs uploaded list in song
        List<Student> studentsuploaded;
        if (song.getStudentsuploaded()!=null) {
            studentsuploaded = song.getStudentsuploaded();
        }
        else{
            studentsuploaded = new ArrayList<Student>();
        }

        studentsuploaded.add(student);
        song.setStudentsuploaded(studentsuploaded);
        songRepository.save(song);
    }

}
