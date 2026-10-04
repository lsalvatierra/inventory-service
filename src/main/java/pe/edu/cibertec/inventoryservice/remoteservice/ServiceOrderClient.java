package pe.edu.cibertec.inventoryservice.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.inventoryservice.remoteservice.model.OrderDetails;

import java.util.List;

@FeignClient(name = "order-service")
public interface ServiceOrderClient {

    @GetMapping("/order-details")
    List<OrderDetails> getOrderDetails();
}
