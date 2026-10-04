package pe.edu.cibertec.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.inventoryservice.remoteservice.ServiceOrderClient;
import pe.edu.cibertec.inventoryservice.remoteservice.model.OrderDetails;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private final ServiceOrderClient serviceOrderClient;


    @GetMapping("order-details-client")
    public ResponseEntity<List<OrderDetails>> getOrderDetails(){
        return ResponseEntity.ok(
                serviceOrderClient.getOrderDetails());
    }
}
