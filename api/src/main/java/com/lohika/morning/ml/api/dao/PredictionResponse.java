package com.lohika.morning.ml.api.dao;



public class PredictionResponse {

    private String genre;
    private Double popProbability;
    private Double bluesProbability;
    private Double countryProbability;
    private Double hiphopProbability;
    private Double jazzProbability;
    private Double reggaeProbability;
    private Double rockProbability;
    private Double classicProbability;



    public Double getBluesProbability() {
        return bluesProbability;
    }

    public void setBluesProbability(Double bluesProbability) {
        this.bluesProbability = bluesProbability;
    }

    public Double getCountryProbability() {
        return countryProbability;
    }

    public void setCountryProbability(Double countryProbability) {
        this.countryProbability = countryProbability;
    }

    public Double getHiphopProbability() {
        return hiphopProbability;
    }

    public void setHiphopProbability(Double hiphopProbability) {
        this.hiphopProbability = hiphopProbability;
    }

    public Double getJazzProbability() {
        return jazzProbability;
    }

    public void setJazzProbability(Double jazzProbability) {
        this.jazzProbability = jazzProbability;
    }

    public Double getReggaeProbability() {
        return reggaeProbability;
    }

    public void setReggaeProbability(Double reggaeProbability) {
        this.reggaeProbability = reggaeProbability;
    }

    public Double getRockProbability() {
        return rockProbability;
    }

    public void setRockProbability(Double rockProbability) {
        this.rockProbability = rockProbability;
    }

    public Double getClassicProbability() {
        return classicProbability;
    }

    public void setClassicProbability(Double classicProbability) {
        this.classicProbability = classicProbability;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPopProbability() {
        return popProbability;
    }

    public void setPopProbability(Double popProbability) {
        this.popProbability = popProbability;
    }
}