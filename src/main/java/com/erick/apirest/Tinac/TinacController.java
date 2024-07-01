package com.erick.apirest.Tinac;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tinac")
@RequiredArgsConstructor
public class TinacController {

private final TinacService tinacService;

    @PostMapping
    public void createTinaco(@RequestBody Tinac tinac)
    {
        tinacService.createTinaco(tinac);
    }
}
