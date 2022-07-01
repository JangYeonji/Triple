package com.triple.Triple.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.triple.Triple.model.Review;
import com.triple.Triple.model.User;
import com.triple.Triple.model.request.ReviewCreationRequest;
import com.triple.Triple.repository.ReviewRepository;
import com.triple.Triple.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
}
