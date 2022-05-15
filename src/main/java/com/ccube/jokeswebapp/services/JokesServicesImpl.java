package com.ccube.jokeswebapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServicesImpl implements JokesServices {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServicesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
