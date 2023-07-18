package com.solvd.carina.dummyjson.api.product;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}/product/1", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get/response.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductMethod extends AbstractApiMethodV2 {

    public GetProductMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
