package io.github.dftrakesh.constantcode;

public interface ConstantCodes {
    String BASE_END_POINT = "https://app.ecwid.com/api/v3/";
    String PRODUCTS_LIST_END_POINT = "/products";
    String AUTHORIZATION = "Authorization";
    String HTTP_REQUEST_PROPERTY_CONTENT_TYPE = "Content-Type";
    String HTTP_REQUEST_CONTENT_TYPE_JSON = "application/json";
    Integer MAX_ATEMPTS = 600;
    Integer TIME_OUT_DURATION = 1500;
    String ORDERS_LIST_END_POINT = "/orders";
    String PRODUCTS_INVENTORY_END_POINT = "/inventory";
    String INVENTORY_REQUEST_CACHE = "Cache-Control";
    String INVENTORY_REQUEST_CACHE_VALUE = "no-cache";
    String RESPONSE_TYPE = "code";
    String GRANT_TYPE = "authorization_code";
}
