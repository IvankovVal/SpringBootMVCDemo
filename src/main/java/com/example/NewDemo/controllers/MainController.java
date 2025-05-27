package com.example.NewDemo.controllers;

import com.example.NewDemo.models.Exercise;
import com.example.NewDemo.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Exercise> exercises = exerciseRepository.findAll();
        model.addAttribute("exercises", exercises);
        return "home";
    }
}