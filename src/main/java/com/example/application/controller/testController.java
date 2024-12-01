package com.example.application.controller;

import com.example.application.dto.exhibit.CuratorDTO;
import com.example.application.service.testService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/curators")
public class testController {
    private final testService TestService;

    @GetMapping("/{id}")
    public CuratorDTO getCurator(@PathVariable("id") Long id) {
        return TestService.getCuratorWithExhibition(id);
    }
}
