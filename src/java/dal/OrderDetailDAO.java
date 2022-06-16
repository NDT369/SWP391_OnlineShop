/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Brand;
import model.CPU;
import model.Capacity;
import model.Card;
import model.Cart;
import model.Category;
import model.Display;
import model.OperatingSystem;
import model.OrderDetail;
import model.Product;
import model.RAM;

/**
 *
 * @author Pham Minh Giang
 */
public class OrderDetailDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public List<OrderDetail> getOrderDetail(int orderID) {
        List<OrderDetail> list = new ArrayList<>();
        String sql = "Select * from OrderDetail o \n"
                + "join Product p on o.Product_ID = p.Product_ID\n"
                + "join Category c on p.Category_ID = c.Category_ID\n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join [Card] ca on p.Card_ID = ca.Card_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join OperatingSystem os on p.OS_ID = os.OS_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "where o.Order_ID = " + orderID;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                Brand brand = new Brand(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                Card card = new Card(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                Capacity capacity = new Capacity(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                CPU cpu = new CPU(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                RAM ram = new RAM(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                OperatingSystem os = new OperatingSystem(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                Display display = new Display(rs.getInt(43), rs.getString(44), rs.getBoolean(45));

                Product p = new Product(rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8),
                        rs.getInt(9), rs.getString(10), rs.getString(11), brand, category, os, ram, cpu, display, capacity, card,
                        rs.getString(20), rs.getBoolean(21));

                list.add(new OrderDetail(rs.getInt(1), p, rs.getInt(3), rs.getDouble(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        OrderDetailDAO o = new OrderDetailDAO();
        List<OrderDetail> list = o.getOrderDetail(1);
        System.out.println(list.size());
    }
}
