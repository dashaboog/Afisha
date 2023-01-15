package ru.netology.domain;

public class PosterManager {
    private String[] films = new String[0];
    private int numberOfFilms;

    public PosterManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public PosterManager() {
        this.numberOfFilms = 10;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < numberOfFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberOfFilms;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
