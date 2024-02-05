package io.github.dftrakesh;

import io.github.dftrakesh.handler.JsonBodyHandler;
import io.github.dftrakesh.model.AccessCredentials;
import io.github.dftrakesh.model.product.Product;
import io.github.dftrakesh.model.product.ProductInventoryRequest;
import io.github.dftrakesh.model.product.ProductInventoryResponse;
import io.github.dftrakesh.model.product.ProductResponse;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static io.github.dftrakesh.constantcode.ConstantCodes.*;

public class ProductAPI extends LightSpeedSDK {

    public ProductAPI(AccessCredentials accessCredentials) {
        super(accessCredentials);
    }

    public ProductResponse searchProducts(HashMap<String, String> params) {
        URI uri = URI.create(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT);
        uri = addParameters(uri, params);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<ProductResponse> handler = new JsonBodyHandler<>(ProductResponse.class);
        return getRequestWrapped(request, handler);
    }

    public Product getProduct(Integer productId) {
        URI uri = URI.create(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT + "/" + productId);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Product> handler = new JsonBodyHandler<>(Product.class);
        return getRequestWrapped(request, handler);
    }

    public ProductInventoryResponse adjustProductInventory(Integer productId, ProductInventoryRequest productInventoryRequest) {
        URI uri = URI.create(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT + "/" + productId + PRODUCTS_INVENTORY_END_POINT);
        HttpRequest request = put(uri, productInventoryRequest);
        HttpResponse.BodyHandler<ProductInventoryResponse> handler = new JsonBodyHandler<>(ProductInventoryResponse.class);
        return getRequestWrapped(request, handler);
    }
}