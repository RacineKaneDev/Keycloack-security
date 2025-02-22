package com.kadiri.keycloak.products.services;

import com.kadiri.keycloak.products.dto.requests.ProductDtoRequest;
import com.kadiri.keycloak.products.dto.responses.ProductDtoResponse;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<ProductDtoResponse> saveProduct(ProductDtoRequest productDto);
    Optional<List<ProductDtoResponse>> getAllProducts();
    Optional<ProductDtoResponse> getProductByRef(String ref);
    boolean deleteProduct(String ref);
    Optional<ProductDtoResponse> updateProduct(ProductDtoRequest productDto);

}
