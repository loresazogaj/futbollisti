package com.futbollisti.controllers;

import com.futbollisti.dto.FutbollistiDto;
import com.futbollisti.services.FutbollistiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/futbollisti")
@CrossOrigin(origins = "*")
public class FutbollistiController {

    private final FutbollistiService futbollistiService;


    public FutbollistiController(FutbollistiService futbollistiService) {
        this.futbollistiService = futbollistiService;
    }


    @GetMapping
    public List<FutbollistiDto> getAllFutbollistat() {
        return futbollistiService.findAll();
    }

    @GetMapping("/{id}")
    public FutbollistiDto getById(@PathVariable long id) {
        return futbollistiService.findById(id);
    }
    @PostMapping
    public void addReportCase(@RequestBody FutbollistiDto newFutbollisti){
        futbollistiService.add(newFutbollisti);
    }
    @PutMapping("/{id}")
    public void updateReportCase(@PathVariable long id, @RequestBody FutbollistiDto updatedFutbollisti){
        futbollistiService.modify(id, updatedFutbollisti);
    }
}
