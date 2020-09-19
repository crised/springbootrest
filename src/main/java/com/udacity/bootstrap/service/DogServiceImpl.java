package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findBreedsById();
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedsById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return dogRepository.findBreedsById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findNames();
    }
}
