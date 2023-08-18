package com.example.demo.Controller;

import com.example.demo.Domain.Pet;
import com.example.demo.Repository.PetRepository;
import com.example.demo.Service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class HomeController {
    private final PetService petService;

    @GetMapping("/home")
    public List<Pet> getPetsForHome(@RequestParam int count){
        System.out.println("home call");
        return petService.getLastPets(count);
    }



}
