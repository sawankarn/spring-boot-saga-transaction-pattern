package com.youtube.javapuzzle.controller;

import com.youtube.javapuzzle.entity.Cab;
import com.youtube.javapuzzle.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/cabs")
public class CabController {

    private final CabService cabService;

    @Autowired
    public CabController(CabService cabService) {
        this.cabService = cabService;
    }

    @GetMapping
    public List<Cab> getAllCabs() {
        return cabService.getAllCabs();
    }

    @GetMapping("/{id}")
    public Optional<Cab> getCabById(@PathVariable UUID id) {
        return cabService.getCabById(id);
    }

    @PostMapping
    public Cab saveCab(@RequestBody Cab cab) {
        return cabService.saveCab(cab);
    }

    @DeleteMapping("/{id}")
    public void deleteCab(@PathVariable UUID id) {
        cabService.deleteCab(id);
    }
}

