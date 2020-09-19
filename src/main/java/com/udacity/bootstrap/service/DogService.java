package com.udacity.bootstrap.service;

import java.util.List;

public interface DogService {

    List<String> findBreeds();

    String findBreedsById(Long id);

    List<String> findNames();


}
