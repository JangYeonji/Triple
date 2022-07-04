package com.triple.Triple.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.triple.Triple.model.enums.Action;
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
    private String type;
    private Action action;
    private String reviewId;
    private String content;
    private String attachedPhotoIds;
    private String userId;
    private String placeId;

//    @ManyToOne
//    @JoinColumn(name="user_id")
//    @JsonManagedReference
//    private User userId;
//
//    @ManyToOne
//    @JoinColumn(name="place_id")
//    @JsonManagedReference
//    private Place placeId;

}
