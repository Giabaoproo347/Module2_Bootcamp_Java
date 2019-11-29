package com.practice.service;

import com.practice.model.Supplier;

public interface SupplierService {
    Iterable<Supplier> findAll();
    Supplier findById(Long id);
    void save(Supplier supplier);
    void remove(Long id);
}
