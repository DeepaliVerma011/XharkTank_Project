package com.example.XharkTank.repository;


import com.example.XharkTank.model.Pitch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitchRepository extends MongoRepository<Pitch, String> {
}