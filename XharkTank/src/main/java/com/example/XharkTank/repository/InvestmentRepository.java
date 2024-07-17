package com.example.XharkTank.repository;

import com.example.XharkTank.model.Investment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends MongoRepository<Investment, String> {
}
