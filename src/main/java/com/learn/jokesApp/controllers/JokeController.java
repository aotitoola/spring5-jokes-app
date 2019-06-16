package com.learn.jokesApp.controllers;

import com.learn.jokesApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aanuoluwa Otitoola <aotitoola@ecobank.com>
 * @since 15/06/2019 Sat
 */

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chuckNorris";
    }
}
