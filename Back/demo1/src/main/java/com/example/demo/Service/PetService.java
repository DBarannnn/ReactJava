package com.example.demo.Service;

import com.example.demo.Domain.Pet;
import com.example.demo.Repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetService {
    private final PetRepository petRepository;

    public Page<Pet> getLastPets(int page, int pageSize){
        Pageable pageable = PageRequest.of(page, pageSize);
        return petRepository.findAll(pageable);
    }
}
