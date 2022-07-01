package com.triple.Triple.service;

import com.triple.Triple.model.User;
import com.triple.Triple.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


}
