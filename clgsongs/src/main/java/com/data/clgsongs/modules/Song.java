package com.data.clgsongs.modules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Song{
    @Id
    private String title;

    @Column(length = 1000)
    private String lyrics;

    private String language;

//    private String genre;


    @Builder.Default
    private int entry_count=0;

    @JsonIgnore
    @Builder.Default
    public static int entry_limit=5;

    @JsonIgnore
    @ManyToMany(mappedBy = "songsuploded")
    private List<Student> studentsuploaded;
}
