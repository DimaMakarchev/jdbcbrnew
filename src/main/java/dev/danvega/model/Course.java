package dev.danvega.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private int courseId;
    private String title;
    private String description;
    private String link;
}
