import handler.JsonBodyHandler;
import lombok.SneakyThrows;
import model.AccessCredentials;
import model.product.Product;
import model.product.ProductInventoryResponse;
import model.product.ProductResponse;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static constantcode.ConstantCodes.*;

public class ProductAPI extends LightSpeedSDK {

    public ProductAPI(AccessCredentials accessCredentials) {
        super(accessCredentials);
    }

    @SneakyThrows
    public ProductResponse searchProducts(HashMap<String, String> params) {
        URI uri = new URI(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT);
        uri = addParameters(uri, params);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<ProductResponse> handler = new JsonBodyHandler<>(ProductResponse.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public Product getProduct(Integer productId) {
        URI uri = new URI(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT + "/" + productId);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Product> handler = new JsonBodyHandler<>(Product.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public ProductInventoryResponse adjustProductInventory(Integer productId, String jsonBody) {
        URI uri = new URI(BASE_END_POINT + accessCredentials.getStoreId() + PRODUCTS_LIST_END_POINT + "/" + productId + PRODUCTS_INVENTORY_END_POINT);
        HttpRequest request = put(uri, jsonBody);
        HttpResponse.BodyHandler<ProductInventoryResponse> handler = new JsonBodyHandler<>(ProductInventoryResponse.class);
        return getRequestWrapped(request, handler);
    }
}