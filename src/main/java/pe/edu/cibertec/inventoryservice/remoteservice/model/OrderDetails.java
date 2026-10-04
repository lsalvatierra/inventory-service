package pe.edu.cibertec.inventoryservice.remoteservice.model;

public record OrderDetails(
        String nombreProducto,
        Integer cantidad,
        Double precioUnitario
) {
}
