package com.triple.Triple.model.request;

import lombok.Data;

@Data
public class ReviewCreationRequest {
    private String reviewId;
    private String content;
    private String attachedPhotoIds;
    private Long userId;
}
