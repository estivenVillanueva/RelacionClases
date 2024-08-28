//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import models.Cliente;
import models.Factura;
import models.ItemFactura;
import models.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();

        Factura factura = new Factura(1, desc, new java.util.Date(), cliente, new ItemFactura[5]);

        for(int i = 0; i < 5; i++){
            Producto producto = new Producto();
            System.out.print("Ingrese producto nº " + (i + 1) + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            int cantidad = s.nextInt();
            s.nextLine(); // Consumir el salto de línea

            ItemFactura item = new ItemFactura(producto, cantidad);
            factura.getItems()[i] = item;
        }

        System.out.println("Factura:");
        System.out.println("Número de factura: " + factura.getFolio());
        System.out.println("Descripción: " + factura.getDescripcion());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Cliente: " + factura.getCliente().getNombre());
        System.out.println("Items:");
        for (ItemFactura item : factura.getItems()) {
            System.out.println("  - " + item.getProducto().getNombre() + " x " + item.getCantidad() + " = " + item.getProducto().getPrecio() * item.getCantidad());
        }
    }
}