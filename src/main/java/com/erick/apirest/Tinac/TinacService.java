package com.erick.apirest.Tinac;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TinacService {

    private final TinacRepository tinacRepo;

    public void createTinaco(Tinac tinac)
    {
        tinacRepo.save(tinac);
    }
}
