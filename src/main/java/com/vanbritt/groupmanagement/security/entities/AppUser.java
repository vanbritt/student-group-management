package com.vanbritt.groupmanagement.security.entities;

import com.vanbritt.groupmanagement.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppUser {
    @Id
    private String userId;

    @Column(unique = true)
    private String username;

    private String password;
    private Boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
    private Collection<AppRole> roles = new HashSet<>();

    @OneToOne
    private Person person;
}
