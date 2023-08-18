package com.example.demo.Service;

import com.example.demo.Domain.Pet;
import com.example.demo.Repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PetService {
    private final PetRepository petRepository;

    public List<Pet> getLastPets(int count){
        if(count <= 0) count = 1;
        List<Pet> all = petRepository.findAll();
        if(all.size() > count){
            return all.subList(0,count);
        }
        return all.subList(0,all.size());
    }
}
