package com.practice.repository;

import com.practice.model.Supplier;
import com.practice.model.Material;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMaterialRepository extends PagingAndSortingRepository<Material, Long> {
    Iterable<Material> findAllBySupplier(Supplier supplier);

    Page<Material> findAllByName(String name, Pageable pageable);
}
