package com.programmingtechie.product_service.controller;


import com.programmingtechie.product_service.dto.ProductRequest;
import com.programmingtechie.product_service.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {


    }
}
