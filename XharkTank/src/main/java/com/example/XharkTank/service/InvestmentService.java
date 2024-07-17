package com.example.XharkTank.service;

import com.example.XharkTank.model.Investment;
import com.example.XharkTank.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;

    public Investment createInvestment(Investment investment) {
        return investmentRepository.save(investment);
    }

    public List<Investment> getInvestmentsByPitchId(String pitchId) {
        return investmentRepository.findAll()
                .stream()
                .filter(investment -> investment.getPitchId().equals(pitchId))
                .toList();
    }
}
