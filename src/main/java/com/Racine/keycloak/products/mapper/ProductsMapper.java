package com.kadiri.keycloak.products.mapper;

import com.kadiri.keycloak.products.dto.requests.ProductDtoRequest;
import com.kadiri.keycloak.products.dto.responses.ProductDtoResponse;
import com.kadiri.keycloak.products.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductsMapper {
    @Mapping(source = "ref", target = "ref")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "idUser", target = "idUser")
    ProductEntity toProductEntity(ProductDtoRequest productDto) ;
    ProductDtoResponse toProductDtoResponse(ProductEntity productEntity) ;
    List<ProductDtoResponse> toProductDtoResponseList(List<ProductEntity> productEntityList) ;
    List<ProductEntity> toProductEntityList(List<ProductDtoRequest> productDtoList) ;

}
