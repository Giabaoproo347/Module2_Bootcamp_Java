package com.practice.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplier_id;
    private String supplier_name;
    private String supplier_description;
    private String supplier_address;

    @OneToMany(targetEntity = Material.class)
    private Set<Material> materials;

    public Supplier() {
    }

    public Supplier(String supplier_name, String supplier_description, String supplier_address, Set<Material> materials) {
        this.supplier_name = supplier_name;
        this.supplier_description = supplier_description;
        this.supplier_address = supplier_address;
        this.materials = materials;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_description() {
        return supplier_description;
    }

    public void setSupplier_description(String supplier_description) {
        this.supplier_description = supplier_description;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }
}
