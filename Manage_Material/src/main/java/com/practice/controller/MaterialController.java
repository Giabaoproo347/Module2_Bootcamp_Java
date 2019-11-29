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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @Autowired
    private SupplierService supplierService;

    @ModelAttribute ("supplier")
    public Iterable<Supplier> suppliers() {
        return supplierService.findAll();
    }

    @GetMapping("/find-material")
    public ModelAndView listMaterial(@RequestParam("s") Optional<String> s, Pageable pageable) {
        Page<Material> materials;
        if (s.isPresent()) {
            materials = materialService.findAllByName(s.get(), pageable);
        } else {
            materials =  materialService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("material/find");
        modelAndView.addObject("materials", materials);
        return  modelAndView;
    }

    @GetMapping("/list-material")
    public String showPageMaterial(Model model, @PageableDefault(size = 5, page = 0, sort = "price", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Material> materials = materialService.findAll(pageable);
        model.addAttribute("materials", materials);
        return "material/list";
    }

    @GetMapping("/list")
    public ModelAndView showCreatMaterial() {
        ModelAndView modelAndView = new ModelAndView("material/create");
        modelAndView.addObject("materials", new Material());
        return modelAndView;
    }

    @PostMapping("/save-material")
    public ModelAndView saveMaterial(@ModelAttribute ("material") Material material) {
        materialService.save(material);
        ModelAndView modelAndView = new ModelAndView("material/create");
        modelAndView.addObject("materials", new Material());
        return  modelAndView;
    }

    @GetMapping("edit-material/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Material material = materialService.findById(id);
        if (material != null) {
            ModelAndView modelAndView = new ModelAndView("material/edit");
            modelAndView.addObject("materials", material);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("material/eror");
            return modelAndView;
        }
    }

    @PostMapping("/update-material")
    public ModelAndView updateMaterial(@ModelAttribute Material material) {
        materialService.save(material);
        ModelAndView modelAndView = new ModelAndView("material/edit");
        modelAndView.addObject("materials", material);
        return modelAndView;
    }

    @GetMapping("/delete-material/{id}")
    public ModelAndView showDeleteMateril(@PathVariable Long id) {
        Material material = materialService.findById(id);
        if (material != null) {
            ModelAndView modelAndView = new ModelAndView("material/delete");
            modelAndView.addObject("materials", material);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("eror");
            return modelAndView;
        }
    }

    @PostMapping("/remove-material")
    public String deleteMaterial(@ModelAttribute Material material) {
        materialService.remove(material.getId());
        return "material/list";
    }

}
