package com.triple.Triple.repository;

import com.triple.Triple.JpaRepository;
import com.triple.Triple.model.Place;
import com.triple.Triple.model.User;

import java.util.Optional;

public interface PlaceRepository extends JpaRepository<Place, Long> {
    Optional<Place> findByPlaceId(String placeId);
}
