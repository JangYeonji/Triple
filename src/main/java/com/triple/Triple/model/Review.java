package com.triple.Triple.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reviewId;
    private String content;
    private String attachedPhotoIds;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonManagedReference
    private User user;

    @ManyToOne
    @JoinColumn(name="place_id")
    @JsonManagedReference
    private Place place;
}
