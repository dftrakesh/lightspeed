package io.github.dftrakesh;

import io.github.dftrakesh.handler.JsonBodyHandler;
import io.github.dftrakesh.model.AccessCredentials;
import io.github.dftrakesh.model.order.Order;
import io.github.dftrakesh.model.order.OrderResponse;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static io.github.dftrakesh.constantcode.ConstantCodes.*;

public class OrderAPI extends LightSpeedSDK {

    public OrderAPI(AccessCredentials accessCredentials) {
        super(accessCredentials);
    }

    public OrderResponse searchOrders(HashMap<String, String> params) {
        URI uri = URI.create(BASE_END_POINT + accessCredentials.getStoreId() + ORDERS_LIST_END_POINT);
        uri = addParameters(uri, params);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<OrderResponse> handler = new JsonBodyHandler<>(OrderResponse.class);
        return getRequestWrapped(request, handler);
    }

    public Order getOrder(String orderId) {
        URI uri = URI.create(BASE_END_POINT + accessCredentials.getStoreId() + ORDERS_LIST_END_POINT + "/" + orderId);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Order> handler = new JsonBodyHandler<>(Order.class);
        return getRequestWrapped(request, handler);
    }
}