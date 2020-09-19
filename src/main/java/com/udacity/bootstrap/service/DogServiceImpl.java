package com.udacity.bootstrap.service;

import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    private DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<String> findBreeds() {
        return dogRepository.findBreedsById();
    }

    @Override
    public String findBreedsById(Long id) {
        return dogRepository.findBreedsById(id);
    }

    @Override
    public List<String> findNames() {
        return dogRepository.findNames();
    }
}
