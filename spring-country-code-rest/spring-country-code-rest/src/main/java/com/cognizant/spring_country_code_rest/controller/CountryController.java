package com.cognizant.spring_country_code_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_country_code_rest.model.Country;
import com.cognizant.spring_country_code_rest.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(
            @PathVariable String code) {

        return countryService.getCountry(code);

    }

}