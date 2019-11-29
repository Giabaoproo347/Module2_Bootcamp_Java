package com.practice.repository;

import com.practice.model.Supplier;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISupplierRepository extends PagingAndSortingRepository<Supplier, Long> {
}
