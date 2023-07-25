package com.solvd.carina.dummyjson.apitest;

import com.solvd.carina.dummyjson.api.product.*;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import java.lang.invoke.MethodHandles;

public class ProductTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "asure")
    public void testCreateProduct() {
        LOGGER.info("testCreateProduct");
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.setProperties("api/products/product.properties");
        postProductMethod.callAPIExpectSuccess();
        postProductMethod.validateResponse();

    }

    @Test
    @MethodOwner(owner = "asure")
    public void testGetProduct() {
        LOGGER.info("testGetProducts");
        GetProductMethod getProductMethod = new GetProductMethod(1);
        getProductMethod.callAPIExpectSuccess();
        getProductMethod.validateResponseAgainstSchema("api/products/_get/response.schema");
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testDeleteProduct() {
        LOGGER.info("testDeleteProducts");
        DeleteProductMethod deleteProductMethod = new DeleteProductMethod();
        deleteProductMethod.callAPI();
        deleteProductMethod.validateResponseAgainstSchema("api/products/_delete/response.schema");
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testPutProduct() {
        LOGGER.info("testPutProducts");
        PutProductMethod putProductMethod = new PutProductMethod(1);
        putProductMethod.callAPI();
        putProductMethod.validateResponse();
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testGetAllProducts() {
        LOGGER.info("testGetProducts");
        GetAllProductsMethod getAllProductsMethod = new GetAllProductsMethod();
        getAllProductsMethod.callAPIExpectSuccess();
        getAllProductsMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey() + "products");
    }
}
