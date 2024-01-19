package com.getarrays.pagination.service.impl;

import com.getarrays.pagination.domain.Users;
import com.getarrays.pagination.repository.UserRepository;
import com.getarrays.pagination.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.PageRequest.of;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<Users> getUsers(String name, int page, int size) {
        log.info ("Fetching users for page {} of size {} ",page,size);
        return userRepository.findByNameContaining(name, of(page, size));
    }
}
