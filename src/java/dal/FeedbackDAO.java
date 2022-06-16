/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Feedback;

/**
 *
 * @author Pham Minh Giang
 */
public class FeedbackDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public boolean checkFeedback(int accountID, int productID) {
        String sql = "select * from [Order] o \n"
                + "join OrderDetail od on o.Order_ID = od.Order_ID\n"
                + "where o.Account_ID = " + accountID + " and od.Product_ID = " + productID;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public List<Feedback> getAllFeedbackByProID(int id) {
        List<Feedback> list = new ArrayList<>();
        String sql = "select * from Feedback f\n"
                + "join Account a on f.Account_ID = a.Account_ID\n"
                + "where f.Product_ID = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setAccountID(rs.getInt(3));
                a.setName(rs.getString(11));
                list.add(new Feedback(rs.getInt(1), rs.getInt(2), a,
                        rs.getString(4), rs.getString(6), rs.getBoolean(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addFeedback(Feedback f) {
        String sql = "insert into Feedback values(?, ?, ?, null, ?, 1)";
        LocalDate curdate = java.time.LocalDate.now();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, f.getProductID());
            ps.setInt(2, f.getAccount().getAccountID());
            ps.setString(3, f.getContent());
            ps.setString(4, curdate.toString());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        FeedbackDAO f = new FeedbackDAO();
        System.out.println(f.getAllFeedbackByProID(2).size());
    }
}
