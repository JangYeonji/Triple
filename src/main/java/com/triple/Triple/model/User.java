package com.triple.Triple.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int point;

    @JsonBackReference
    @OneToMany(mappedBy = "user_id", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Review> reviews;
}
