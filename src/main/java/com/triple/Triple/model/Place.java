package com.triple.Triple.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeId;

    @Enumerated(EnumType.STRING)
    private ReviewStatus status;

    @JsonBackReference
    @OneToMany(mappedBy = "place", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Review> reviews;
}
