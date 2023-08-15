package com.example.demo.Repository;

import com.example.demo.Domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
