package com.ricchh.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.ricchh.ecommerce.entity.Product;
import com.ricchh.ecommerce.entity.ProductCategory;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

    HttpMethod[] unsupportedActions = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };

    // disable unsupportedActions - Products
    config.getExposureConfiguration().forDomainType(Product.class)
        .withItemExposure((metaData, httpMethods) -> httpMethods.disable(unsupportedActions))
        .withCollectionExposure((metaData, httpMethods) -> httpMethods.disable(unsupportedActions));

    // disable unsupportedActions - ProductCategory
    config.getExposureConfiguration().forDomainType(ProductCategory.class)
        .withItemExposure((metaData, httpMethods) -> httpMethods.disable(unsupportedActions))
        .withCollectionExposure((metaData, httpMethods) -> httpMethods.disable(unsupportedActions));
  }

}
