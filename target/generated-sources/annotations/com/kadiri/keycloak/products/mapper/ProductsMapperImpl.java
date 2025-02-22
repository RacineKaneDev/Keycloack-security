package com.kadiri.keycloak.products.mapper;

import com.kadiri.keycloak.products.dto.requests.ProductDtoRequest;
import com.kadiri.keycloak.products.dto.responses.ProductDtoResponse;
import com.kadiri.keycloak.products.entities.ProductEntity;
import com.kadiri.keycloak.products.entities.ProductEntity.ProductEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-18T21:28:54+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class ProductsMapperImpl implements ProductsMapper {

    @Override
    public ProductEntity toProductEntity(ProductDtoRequest productDto) {
        if ( productDto == null ) {
            return null;
        }

        ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.ref( productDto.getRef() );
        productEntity.name( productDto.getName() );
        productEntity.stock( productDto.getStock() );
        productEntity.idUser( productDto.getIdUser() );

        return productEntity.build();
    }

    @Override
    public ProductDtoResponse toProductDtoResponse(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductDtoResponse productDtoResponse = new ProductDtoResponse();

        productDtoResponse.setRef( productEntity.getRef() );
        productDtoResponse.setName( productEntity.getName() );
        productDtoResponse.setStock( productEntity.getStock() );
        productDtoResponse.setIdUser( productEntity.getIdUser() );

        return productDtoResponse;
    }

    @Override
    public List<ProductDtoResponse> toProductDtoResponseList(List<ProductEntity> productEntityList) {
        if ( productEntityList == null ) {
            return null;
        }

        List<ProductDtoResponse> list = new ArrayList<ProductDtoResponse>( productEntityList.size() );
        for ( ProductEntity productEntity : productEntityList ) {
            list.add( toProductDtoResponse( productEntity ) );
        }

        return list;
    }

    @Override
    public List<ProductEntity> toProductEntityList(List<ProductDtoRequest> productDtoList) {
        if ( productDtoList == null ) {
            return null;
        }

        List<ProductEntity> list = new ArrayList<ProductEntity>( productDtoList.size() );
        for ( ProductDtoRequest productDtoRequest : productDtoList ) {
            list.add( toProductEntity( productDtoRequest ) );
        }

        return list;
    }
}
