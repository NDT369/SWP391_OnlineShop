/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pham Minh Giang
 */
public class OrderDetail {
   private int OrderID;
   private Product product;
   private int quantity;
   private double price;

    public OrderDetail() {
    }

    public OrderDetail(int OrderID, Product product, int quantity, double price) {
        this.OrderID = OrderID;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "OrderID=" + OrderID + ", product=" + product + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
   
}
