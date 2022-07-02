//package com.triple.Triple.model;
//
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Getter
//@Setter
//@NoArgsConstructor
//public class ReviewDto {
//    private String type;
//    private String action;
//    private String reviewId;
//    private String content;
//    private List<String> attachedPhotoIds;
//    private String user_id;
//    private String place_id;
//
////    @Builder
////    public ReviewDto(String type, String action, String reviewId, String content, List<String> attachedPhotoIds, String user_id, String place_id){
////        this.type = type;
////        this.action = action;
////        this.reviewId = reviewId;
////        this.content = content;
////        this.attachedPhotoIds = attachedPhotoIds;
////        this.user_id = user_id;
////        this.place_id = place_id;
////    }
//
////    public Review toEntity(User user, Item item){
////        return Review.builder()
////                .user(user)
////                .item(item)
////                .content(content)
////                .point(point)
////                .imageUrl(imageUrl)
////                .build();
////    }
//}
