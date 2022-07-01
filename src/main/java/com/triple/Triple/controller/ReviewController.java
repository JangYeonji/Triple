package com.triple.Triple.controller;

import com.triple.Triple.model.Review;
import com.triple.Triple.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    //모든 리뷰 조회
    @GetMapping("")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    //아이디별 리뷰 조회
    @GetMapping("/{reviewId}")
    public Review getReviewByReviewId(@PathVariable String reviewId){
        return reviewService.getReviewByReviewId(reviewId);
    }

    //리뷰 등록
    @PostMapping("")
    @ResponseBody
    public Review registerReview(@RequestBody Review review){
        return reviewService.registerReview(review);
    }

    //리뷰 수정
    @PutMapping("/{reviewId}")
    public void modifyReview(@PathVariable String reviewId, @RequestBody Review review){
        reviewService.modifyReview(reviewId,review);
    }

    //리뷰 삭제
    @DeleteMapping("/{reviewId}")
    public void removeReview(@PathVariable String reviewId){
        reviewService.removeReview(reviewId);
    }
}
