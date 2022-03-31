package com.example.springdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdRepository extends PagingAndSortingRepository<Ad, Long> {
}
