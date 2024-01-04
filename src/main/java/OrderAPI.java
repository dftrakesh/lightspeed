import handler.JsonBodyHandler;
import lombok.SneakyThrows;
import model.AccessCredentials;
import model.order.Order;
import model.order.OrderResponse;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static constantcode.ConstantCodes.*;

public class OrderAPI extends LightSpeedSDK {

    public OrderAPI(AccessCredentials accessCredentials) {
        super(accessCredentials);
    }

    @SneakyThrows
    public OrderResponse searchOrders(HashMap<String, String> params) {
        URI uri = new URI(BASE_END_POINT + accessCredentials.getStoreId() + ORDERS_LIST_END_POINT);
        uri = addParameters(uri, params);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<OrderResponse> handler = new JsonBodyHandler<>(OrderResponse.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public Order getOrder(String orderId) {
        URI uri = new URI(BASE_END_POINT + accessCredentials.getStoreId() + ORDERS_LIST_END_POINT + "/" + orderId);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Order> handler = new JsonBodyHandler<>(Order.class);
        return getRequestWrapped(request, handler);
    }
}
