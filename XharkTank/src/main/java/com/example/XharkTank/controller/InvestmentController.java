package com.example.XharkTank.controller;

import com.example.XharkTank.model.Investment;
import com.example.XharkTank.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investments")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    @PostMapping
    public ResponseEntity<Investment> createInvestment(@RequestBody Investment investment) {
        Investment createdInvestment = investmentService.createInvestment(investment);
        return ResponseEntity.ok(createdInvestment);
    }

    @GetMapping("/pitch/{pitchId}")
    public ResponseEntity<List<Investment>> getInvestmentsByPitchId(@PathVariable String pitchId) {
        List<Investment> investments = investmentService.getInvestmentsByPitchId(pitchId);
        return ResponseEntity.ok(investments);
    }
}
