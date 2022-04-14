package com.lohika.morning.ml.api.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.lohika.morning.ml.api.dao.Lyric;
import com.lohika.morning.ml.api.dao.PredictionResponse;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller

public class VisualizationController {

    @GetMapping("/home")
    public String lyricsForm(Model model) {
        model.addAttribute("lyric", new Lyric());
        return "home";
    }

    @PostMapping("/home")
    public String lyricsSubmit(@ModelAttribute Lyric lyric, Model model) {

        String uri = "http://localhost:9091/lyrics/predict";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>(lyric.getContent());

        PredictionResponse predictionResponse = restTemplate.postForObject(uri, request, PredictionResponse.class);
        /*log.info("PredictionResponse: Genre: " + predictionResponse.getGenre());
        log.info("PredictionResponse: MetalProbability: " + predictionResponse.getMetalProbability());
        log.info("PredictionResponse: PopProbability: " + predictionResponse.getPopProbability());*/

        model.addAttribute("Genre", predictionResponse.getGenre());
        model.addAttribute("PopProbability", predictionResponse.getPopProbability());
        model.addAttribute("BluesProbability", predictionResponse.getBluesProbability());
        model.addAttribute("CountryProbability", predictionResponse.getCountryProbability());
        model.addAttribute("HiphopProbability", predictionResponse.getHiphopProbability());
        model.addAttribute("JazzProbability", predictionResponse.getJazzProbability());
        model.addAttribute("ReggaeProbability", predictionResponse.getReggaeProbability());
        model.addAttribute("RockProbability", predictionResponse.getRockProbability());
        model.addAttribute("ClassicProbability", predictionResponse.getClassicProbability());

        return "pieChart";
    }

//	@GetMapping("/displayBarGraph")
//	public String barGraph(Model model) {
//		Map<String, Integer> surveyMap = new LinkedHashMap<>();
//		surveyMap.put("Java", 40);
//		surveyMap.put("Dev oops", 25);
//		surveyMap.put("Python", 20);
//		surveyMap.put(".Net", 15);
//		model.addAttribute("surveyMap", surveyMap);
//		return "barGraph";
//	}

}