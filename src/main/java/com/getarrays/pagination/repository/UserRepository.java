package com.getarrays.pagination.repository;

import com.getarrays.pagination.domain.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Users,Long>{
    Page<Users> findByNameContaining(String name, Pageable pageable);
}
