package com.triple.Triple.controller;

import com.triple.Triple.model.Review;
import com.triple.Triple.model.request.ReviewCreationRequest;
import com.triple.Triple.service.ReviewService;
import com.triple.Triple.service.TripleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ReviewController {

    private final TripleService tripleService;

    @GetMapping("/{userId}")
    public ResponseEntity readUser(@RequestParam String userId) {
        return ResponseEntity.ok(tripleService.readUser(userId));
    }

    @PostMapping("/events")
    public ResponseEntity<Review> createReview(@RequestBody ReviewCreationRequest request){
        return ResponseEntity.ok(tripleService.createReview(request));
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<Void> deleteReview (@PathVariable Long reviewId){
        tripleService.deleteReview(reviewId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{reviewId}")
    public ResponseEntity<Review> updateReview(@RequestBody ReviewCreationRequest request, @PathVariable Long reviewId){
        return ResponseEntity.ok(tripleService.updateReview(reviewId,request));
    }
}
