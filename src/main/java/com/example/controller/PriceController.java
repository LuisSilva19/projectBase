package com.example.controller;

import com.example.entite.Price;
import com.example.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController(value = "/price")
@RequiredArgsConstructor
public class PriceController {

    private PriceRepository priceRepository;

    @GetMapping(path = "/{id}")
    public Price getPrice(@PathVariable("id") long productId) {
        log.info("Getting Price details for Product Id {}", productId);
        return priceRepository.getPrice(productId);
    }
}