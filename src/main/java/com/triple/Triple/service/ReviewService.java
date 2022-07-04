package com.triple.Triple.service;

import com.triple.Triple.model.Review;
import com.triple.Triple.model.request.ReviewCreationRequest;
import com.triple.Triple.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public Review createReview(Review review)  {


        System.out.println("@@@CREATEReview : ");
        System.out.println("@@@review : " + review.getReviewId());
        Review reviewToCreate = new Review();
        BeanUtils.copyProperties(review, reviewToCreate);
        System.out.println("@@@reviewToCreate : " + reviewToCreate.getReviewId());
//        if (validateDuplicate(review)==0){
//            return null;
//        }
        return reviewRepository.save(reviewToCreate);
    }
    private int validateDuplicate(Review review) {
        Optional<Review> findReview = reviewRepository.findById(review.getId());
        if(findReview!=null){
            return 0;
        }
        return 1;
    }
}
