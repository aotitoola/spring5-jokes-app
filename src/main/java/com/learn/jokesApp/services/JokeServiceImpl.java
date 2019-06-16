package com.learn.jokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Aanuoluwa Otitoola
 * @since 15/06/2019 Sat
 */

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

//    private final ChuckNorrisQuotes chuckNorrisQuotes;

//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
