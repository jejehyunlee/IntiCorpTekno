package com.inticorporateknologi.contactapp.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;


    @OneToMany(mappedBy = "user"
            , cascade = CascadeType.ALL
            , fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<UserContact> userContacts;

}
