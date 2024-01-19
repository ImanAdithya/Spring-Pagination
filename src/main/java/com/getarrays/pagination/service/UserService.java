package com.getarrays.pagination.service;

import com.getarrays.pagination.domain.Users;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<Users> getUsers(String name,int page,int size);
}
