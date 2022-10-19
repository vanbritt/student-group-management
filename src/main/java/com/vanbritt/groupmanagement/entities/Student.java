package com.vanbritt.groupmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
//@DiscriminatorValue("STUD")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student extends Person {
    // are we adding student id or not
    private String section;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private Collection<StudentGroup> studentGroup = new HashSet<>();
}
