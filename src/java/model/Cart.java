/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class Cart {

    private List<Item> item;

    public Cart() {
        item = new ArrayList<>();
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    private Item getItemByID(int productID) {
        for (Item i : item) {
            if (i.getProduct().getId() == productID) {
                return i;
            }
        }
        return null;
    }

    public int getQuantityByID(int productID) {
        return getItemByID(productID).getQuantity();
    }
    
    public int getTotalQuantity() {
        int totalQuantity=0;
        for (Item i : item) {
            totalQuantity += i.getQuantity();
        }
        return totalQuantity;
    }
    

    public void addItem(Item i) {
        if (getItemByID(i.getProduct().getId()) != null) {
            Item item = getItemByID(i.getProduct().getId());
            item.setQuantity(item.getQuantity() + i.getQuantity());
        } else {
            item.add(i);
        }
    }

    public void deleteItem(int productID) {
        if (getItemByID(productID) != null) {
            item.remove(getItemByID(productID));
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item i : item) {
            total += i.getPrice() * i.getQuantity();
        }
        return total;
    }

    public Product getProductByID(int productID, List<Product> list) {
        for (Product p : list) {
            if(p.getId() == productID){
                return p;
            }
        }
        return null;
    }
    
    public Cart(String txt, List<Product> list){
        item = new ArrayList();
        try {
            if(txt != null && txt.length() != 0){
                String[] s1 = txt.split(",");
                for (String s : s1) {
                    String[] s2 = s.split(":");
                     int productID = Integer.parseInt(s2[0]);
                     int quantity = Integer.parseInt(s2[1]);
                     
                     Product product = getProductByID(productID, list);
                     Item item = new Item(product, quantity, product.getSaleprice());
                     addItem(item);
                }
            }
        } catch (Exception e) {
        }
    }
}
