package com.triple.Triple.model.request;

import com.triple.Triple.model.enums.Action;
import lombok.Data;

@Data
public class ReviewCreationRequest {
    private String type;
    private Action action;
    private String reviewId;
    private String content;
    private String attachedPhotoIds;
    private String userId;
    private String placeId;
}
