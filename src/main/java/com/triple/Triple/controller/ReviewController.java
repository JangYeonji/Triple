package com.triple.Triple.controller;

import com.triple.Triple.model.Review;
import com.triple.Triple.model.ReviewDto;
import com.triple.Triple.model.request.ReviewCreationRequest;
import com.triple.Triple.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;
    private Review result;


    @GetMapping("/events")
    public ResponseEntity<String> createReview(@RequestBody ReviewDto review){
        return ResponseEntity.ok(review.toString());
    }
//    https://hello-bryan.tistory.com/341?category=745162
//    @PostMapping("/events")
//    public ResponseEntity<Review> createReview(@RequestBody Review request){
//        System.out.println("@@@request : " + request.getReviewId());
//        result = reviewService.createReview(request);
//        return ResponseEntity.ok(result);
//    }
    @DeleteMapping("/events/{placeId}/{userId}")
    public ResponseEntity<Review> deleteReview(@PathVariable String placeId, @PathVariable String userId){
        return ResponseEntity.ok(result);
    }
//    @PutMapping("/events")
//    public ResponseEntity<Review> updateReview(@RequestBody Review request){
//        System.out.println("@@@request : " + request.getReviewId());
//        result = reviewService.updateReview(request);
//        return ResponseEntity.ok(result);
//    }

}
