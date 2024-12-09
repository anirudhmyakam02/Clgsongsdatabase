package com.data.clgsongs.modules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class  Student{

    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false, unique = true)
    private String rollno;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "student_songsuploaded", // Join table name
            joinColumns = @JoinColumn(name = "student_rollno", referencedColumnName = "rollno"), // Foreign key to Student
            inverseJoinColumns = @JoinColumn(name = "song_title", referencedColumnName = "title") // Foreign key to Song
    )
    private List<Song> songsuploded;
}
