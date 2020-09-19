package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query(value = "SELECT breed FROM dog", nativeQuery = true)
    List<String> findBreedsById();

    @Query(value = "SELECT d.id, d.breed FROM dog d WHERE d.id = :id", nativeQuery = true)
    String findBreedsById(Long id);

    @Query(value = "SELECT name FROM dog", nativeQuery = true)
    List<String> findNames();

}
