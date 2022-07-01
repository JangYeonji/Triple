package com.triple.Triple.service;

import com.triple.Triple.model.Review;
import com.triple.Triple.model.User;
import com.triple.Triple.model.request.ReviewCreationRequest;
import com.triple.Triple.repository.PlaceRepository;
import com.triple.Triple.repository.ReviewRepository;
import com.triple.Triple.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TripleService {
    private final PlaceRepository placeRepository;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;

    //readBookById
    public User readUser(String userId){
        Optional<User> user = userRepository.findByUserId(userId);
        if (user.isPresent()) {
            return user.get();
        }

        throw new EntityNotFoundException(
                "Cant find any user under given userId");
    }

    //createBook
    public Review createReview(ReviewCreationRequest review) {
        Optional<User> user = userRepository.findById(review.getUserId());
        if (!user.isPresent()) {
            throw new EntityNotFoundException(
                    "User Not Found");
        }

        Review reviewToCreate = new Review();
        BeanUtils.copyProperties(review, reviewToCreate);
        reviewToCreate.setUser(user.get());
        return reviewRepository.save(reviewToCreate);
    }

    //deleteBook
    public void deleteReview(Long id){
        reviewRepository.deleteById(id);
    }

    //updateMember
    public Review updateReview (Long id, ReviewCreationRequest request){
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if(!optionalReview.isPresent()){
            throw new EntityNotFoundException("Review not present in the database");
        }
        Review review = optionalReview.get();
        review.setContent(request.getContent());
        review.setAttachedPhotoIds(request.getAttachedPhotoIds());
        return reviewRepository.save(review);
    }

}
