package com.sathya.feign;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sathya.model.OrderDTO;

@FeignClient(name = "order-service" , url ="https://spring-order-service.onrender.com")
public interface OrderFeignClient {

    @GetMapping("/api/orders/all")
    List<OrderDTO> getAllOrders();
}
