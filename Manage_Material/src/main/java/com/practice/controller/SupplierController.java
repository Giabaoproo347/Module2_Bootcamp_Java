package com.practice.controller;

import com.practice.model.Material;
import com.practice.model.Supplier;
import com.practice.service.MaterialService;
import com.practice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @Autowired
     private MaterialService materialService;

    @GetMapping("/list-supplier")
    public ModelAndView listSupplier() {
        Iterable<Supplier> suppliers = supplierService.findAll();
        ModelAndView modelAndView = new ModelAndView("supplier/list");
        modelAndView.addObject("suppliers", suppliers);
        return modelAndView;
    }

    @GetMapping("/create-supplier")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("supplier/create");
        modelAndView.addObject("suppliers",new Supplier());
        return modelAndView;
    }

    @PostMapping("/save-supplier")
    public ModelAndView createSupplier(@ModelAttribute Supplier supplier) {
        supplierService.save(supplier);
        ModelAndView modelAndView = new ModelAndView("supplier/list");
        modelAndView.addObject("suppliers", new Supplier());
        modelAndView.addObject("success","You just added a supplier");
        return  modelAndView;
    }

    @GetMapping("/edit-supplier/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Supplier supplier = supplierService.findById(id);
        if (supplier != null) {
            ModelAndView modelAndView = new ModelAndView("supplier/edit");
            modelAndView.addObject("suppliers", supplier);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("eror");
            return modelAndView;
        }
    }

    @PostMapping("/update-supplier")
    public ModelAndView editSupplier(@ModelAttribute Supplier supplier) {
        supplierService.save(supplier);
        ModelAndView modelAndView = new ModelAndView("supplier/list");
        modelAndView.addObject("suppliers", supplier);
        return  modelAndView;
    }

    @GetMapping("delete-supplier/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Supplier supplier = supplierService.findById(id);
        if (supplier != null) {
            ModelAndView modelAndView = new ModelAndView("supplier/delete");
            modelAndView.addObject("suppliers", supplier);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("eror");
            return modelAndView;
        }
    }

    @PostMapping("delete-supplier")
    public String deleteSupplier(@ModelAttribute Supplier  supplier) {
        supplierService.remove(supplier.getSupplier_id());
        return "supplier/delete";

    }
}
