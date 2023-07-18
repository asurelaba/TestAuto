package com.solvd.carina.dummyjson.apitest;

import com.solvd.carina.demo.api.product.*;
import com.solvd.carina.dummyjson.api.product.*;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;


public class ProductTest implements IAbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(ProductTest.class);

    @Test
    @MethodOwner(owner = "asure")
    public void testCreateProduct() {
        LOGGER.info("testCreateProduct");

        PostProductMethod api = new PostProductMethod();
        api.setProperties("api/products/product.properties");
        Response response = api.callAPIExpectSuccess();
        LOGGER.info(response.getBody());
        api.validateResponse();
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testGetProducts() {
        LOGGER.info("testGetProducts");

        GetProductMethod api = new GetProductMethod();
        Response rs = api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/products/_get/response.schema");
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testDeleteProduct() {
        LOGGER.info("testDeleteProducts");

        DeleteProductMethod api = new DeleteProductMethod();
        Response rs = api.callAPI();
        api.validateResponseAgainstSchema("api/products/_delete/response.schema");
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testPutProduct() {
        LOGGER.info("testPutProducts");

        PutProductMethod api = new PutProductMethod();
        api.callAPI();
        api.validateResponse();
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testGetAllProducts() {
        LOGGER.info("testGetProducts");

        GetAllProductsMethod api = new GetAllProductsMethod();
        Response rs = api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey() + "products");
    }

}
