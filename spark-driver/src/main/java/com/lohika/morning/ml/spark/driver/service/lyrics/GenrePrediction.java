package com.lohika.morning.ml.spark.driver.service.lyrics;

public class GenrePrediction {

    private String genre;
    private Double popProbability;
    private Double bluesProbability;
    private Double countryProbability;
    private Double hiphopProbability;
    private Double jazzProbability;
    private Double reggaeProbability;
    private Double rockProbability;
    private Double classicProbability;

    public GenrePrediction(String genre, Double classicProbability, Double popProbability,     Double bluesProbability,
     Double countryProbability,
     Double hiphopProbability,
     Double jazzProbability,
     Double reggaeProbability,
     Double rockProbability) {
        this.genre = genre;
        this.classicProbability = classicProbability;
        this.popProbability = popProbability;
        this.bluesProbability = bluesProbability;
        this.countryProbability = countryProbability;
        this.hiphopProbability = hiphopProbability;
        this.jazzProbability = jazzProbability;
        this.reggaeProbability = reggaeProbability;
        this.rockProbability = rockProbability;
    }

    public GenrePrediction(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public Double getPopProbability() {
        return popProbability;
    }

    public Double getBluesProbability() {
        return bluesProbability;
    }

    public Double getCountryProbability() {
        return countryProbability;
    }

    public Double getHiphopProbability() {
        return hiphopProbability;
    }

    public Double getJazzProbability() {
        return jazzProbability;
    }

    public Double getReggaeProbability() {
        return reggaeProbability;
    }

    public Double getRockProbability() {
        return rockProbability;
    }

    public Double getClassicProbability() {
        return classicProbability;
    }
}
