package com.example.application.controller;

import com.example.application.dto.exhibit.CuratorDTO;
import com.example.application.service.testService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/controll")
public class testController {
    private final testService TestService;

    @GetMapping("/id")
    public CuratorDTO getCurator(@RequestParam Long id){
        return TestService.getCuratorWithExhibition(id);
    }
}
