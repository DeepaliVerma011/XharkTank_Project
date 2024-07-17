package com.example.XharkTank.service;

import com.example.XharkTank.model.Pitch;
import com.example.XharkTank.repository.PitchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchService {

    @Autowired
    private PitchRepository pitchRepository;

    public Pitch createPitch(Pitch pitch) {
        return pitchRepository.save(pitch);
    }

    public List<Pitch> getAllPitches() {
        return pitchRepository.findAll();
    }

    public Pitch getPitchById(String id) {
        return pitchRepository.findById(id).orElse(null);
    }
}
