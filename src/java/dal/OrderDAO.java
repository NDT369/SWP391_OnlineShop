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
import model.Order;

/**
 *
 * @author Pham Minh Giang
 */
public class OrderDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public List<Order> getOrderByCustomer(String id) {
        List<Order> list = new ArrayList<>();
        String sql = "select * from [Order] where Account_ID = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getBoolean(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getTotalOrderByCustomer(String id) {
        int total = 0;
        String sql = "select count(*) from [Order] where Account_ID = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return total;
    }

    public List<Order> getOrderPaging(String id, int index) {
        List<Order> list = new ArrayList<>();
        String sql = "select * from [Order] where Account_ID = " + id + " \n"
                + "order by Order_ID offset ? row fetch next 5 rows only";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getBoolean(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    

    public static void main(String[] args) {
        OrderDAO o = new OrderDAO();
        System.out.println("" + o.getTotalOrderByCustomer("1"));
    }
}
