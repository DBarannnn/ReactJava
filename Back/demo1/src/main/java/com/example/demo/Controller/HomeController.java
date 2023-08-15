package com.example.demo.Controller;

import com.example.demo.Domain.Pet;
import com.example.demo.Repository.PetRepository;
import com.example.demo.Service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class HomeController {
    private final PetRepository petRepository;
    private final PetService petService;

    @GetMapping("/home")
    public Page<Pet> getPetsForHome(){
        Pageable page = PageRequest.of(0, 2);
        return petRepository.findAll(page);
    }



}
