package com.triple.Triple.repository;

import com.triple.Triple.JpaRepository;
import com.triple.Triple.model.Review;
import com.triple.Triple.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

}
