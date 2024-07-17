package com.example.XharkTank.controller;

import com.example.XharkTank.model.Pitch;
import com.example.XharkTank.service.PitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pitches")
public class PitchController {

    @Autowired
    private PitchService pitchService;

    @PostMapping
    public ResponseEntity<Pitch> createPitch(@RequestBody Pitch pitch) {
        Pitch createdPitch = pitchService.createPitch(pitch);
        return ResponseEntity.ok(createdPitch);
    }

    @GetMapping
    public ResponseEntity<List<Pitch>> getAllPitches() {
        List<Pitch> pitches = pitchService.getAllPitches();
        return ResponseEntity.ok(pitches);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pitch> getPitchById(@PathVariable String id) {
        Pitch pitch = pitchService.getPitchById(id);
        return ResponseEntity.ok(pitch);
    }
}