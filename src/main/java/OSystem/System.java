/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OSystem;
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerRepository;
import DataAccess.OrderItemRepository;
import DataAccess.OrderRepository;
import DataAccess.ProductRepository;
import java.util.ArrayList;
/**
 *
 * @author metan
 */
public class System {
    public static void main(String[] args) {

        CustomerRepository customerRepo = new CustomerRepository();
        OrderItemRepository orderItemRepo = new OrderItemRepository();
        OrderRepository orderRepo = new OrderRepository();
        ProductRepository productRepo = new ProductRepository();

        Customer myCustomer1 = new Customer(1, "Bobby", "Johnson", "620-238-1174");
        Product myProduct1 = new Product(20, "PC", 10, 200.00);
        Product myProduct2 = new Product(21, "Graphics Card", 15, 50.00);
        Order myOrder1 = new Order(101, 1, "5/7/2020");
        OrderItem myOrderItem1 = new OrderItem(101, 5, 20, "PC", 10, 200.00);
        OrderItem myOrderItem2 = new OrderItem(101, 6, 21, "Graphics Card", 15, 50.00);

        Customer myCustomer2 = new Customer(2, "Jane", "Doe", "620-239-1175");
        Product myProduct3 = new Product(30, "Skateboard", 3, 500.00);
        Product myProduct4 = new Product(31, "Skateboard Trucks", 7, 25.00);
        Order myOrder2 = new Order(102, 2, "5/8/2020");
        OrderItem myOrderItem3 = new OrderItem(102, 56, 30, "Skateboard", 3, 500.00);
        OrderItem myOrderItem4 = new OrderItem(102, 34, 31, "Skateboard Trucks", 7, 25.00);

        Customer myCustomer3 = new Customer(3, "Tanner", "Stout", "621-239-1175");
        Product myProduct5 = new Product(40, "Desk", 30, 200.00);
        Product myProduct6 = new Product(41, "Deskpad", 5, 15.00);
        Order myOrder3 = new Order(103, 3, "5/10/2020");
        OrderItem myOrderItem5 = new OrderItem(103, 1, 40, "Desk", 30, 200.00);
        OrderItem myOrderItem6 = new OrderItem(103, 2, 41, "Deskpad", 5, 15.00);

        customerRepo.create(myCustomer1);
        orderRepo.create(myOrder1);
        orderItemRepo.create(myOrderItem1);
        orderItemRepo.create(myOrderItem2);
        productRepo.create(myProduct1);
        productRepo.create(myProduct2);

        customerRepo.create(myCustomer2);
        orderRepo.create(myOrder2);
        orderItemRepo.create(myOrderItem3);
        orderItemRepo.create(myOrderItem4);
        productRepo.create(myProduct3);
        productRepo.create(myProduct4);

        customerRepo.create(myCustomer3);
        orderRepo.create(myOrder3);
        orderItemRepo.create(myOrderItem5);
        orderItemRepo.create(myOrderItem6);
        productRepo.create(myProduct5);
        productRepo.create(myProduct6);

        ArrayList<Customer> customersFromDatabase = customerRepo.getAll();
        customersFromDatabase.forEach((dbCustomers) -> {
            System.out.println(dbCustomers.toString());
        });

        System.out.println("-------------------------------------");

        ArrayList<Order> ordersFromDatabase = orderRepo.getAll();
        ordersFromDatabase.forEach((dbOrders) -> {
            System.out.println(dbOrders.toString());
        });

        System.out.println("-------------------------------------");

        ArrayList<OrderItem> orderItemsFromDatabase = orderItemRepo.getAll();
        orderItemsFromDatabase.forEach((dbOrderItem) -> {
            System.out.println(dbOrderItem.toString());
        });

        System.out.println("-------------------------------------");

        ArrayList<Product> productsFromDatabase = productRepo.getAll();
        productsFromDatabase.forEach((dbProduct) -> {
            System.out.println(dbProduct.toString());
        });

    }

    private static class out {

        private static void println(String toString) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public out() {
        }
    }
}
