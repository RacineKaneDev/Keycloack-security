package com.kadiri.keycloak.products.controller;

import com.kadiri.keycloak.products.dto.requests.ProductDtoRequest;
import com.kadiri.keycloak.products.dto.responses.ProductDtoResponse;
import com.kadiri.keycloak.products.services.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/private")
    public String privateEndpoint() {
        return "Bienvenue sur l'endpoint Kadiri Keycloak !";
    }

    @PostMapping
    public ResponseEntity<ProductDtoResponse> saveProduct(@RequestBody @Valid ProductDtoRequest productDto){
        Optional<ProductDtoResponse> productDto1 = productService.saveProduct(productDto);
        return new ResponseEntity<>(productDto1.get(), HttpStatus.CREATED);
    }

    @GetMapping("/{ref}")
    public ResponseEntity<ProductDtoResponse> getProduct(@PathVariable("ref") String ref){
        Optional<ProductDtoResponse> productDto1 = productService.getProductByRef(ref);
        return new ResponseEntity<>(productDto1.get(), HttpStatus.OK);
    }
 }
