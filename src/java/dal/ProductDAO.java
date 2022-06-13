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
import model.Brand;
import model.CPU;
import model.Capacity;
import model.Card;
import model.Cart;
import model.Category;
import model.Display;
import model.Item;
import model.OperatingSystem;
import model.OrderDetail;
import model.Product;
import model.RAM;

/**
 *
 * @author Pham Minh Giang
 */
public class ProductDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID\n";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17)));

            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getSaleProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select  top(5) * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17)));

            }

        } catch (Exception e) {
        }
        return list;

    }

    public List<Product> getNewProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select  top(5) * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID order by Product_ID DESC";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByCate(String cate) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where cat.Category_Name = '" + cate + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByID(String id) {
        Product p = new Product();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_ID = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17));
            }

        } catch (Exception e) {
        }
        return p;
    }

    public Product getProductByID(int productID) {
        Product p = new Product();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_ID = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            if (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17));
            }

        } catch (Exception e) {
        }
        return p;
    }

    public int getTotalProduct() {
        int total = 0;
        String sql = "select count(*) from Product";
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

    public List<Product> listProPaging(int index) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID order by Product_ID offset ? row fetch next 9 rows only";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 9);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(18), rs.getString(19), rs.getBoolean(20));
                Category category = new Category(rs.getInt(21), rs.getString(22), rs.getBoolean(23));
                OperatingSystem os = new OperatingSystem(rs.getInt(24), rs.getString(25), rs.getBoolean(26));
                RAM ram = new RAM(rs.getInt(27), rs.getString(28), rs.getBoolean(29));
                CPU cpu = new CPU(rs.getInt(30), rs.getString(31), rs.getBoolean(32));
                Display display = new Display(rs.getInt(33), rs.getString(34), rs.getBoolean(35));
                Capacity capaciry = new Capacity(rs.getInt(36), rs.getString(37), rs.getBoolean(38));
                Card card = new Card(rs.getInt(39), rs.getString(40), rs.getBoolean(41));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(16), rs.getBoolean(17)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int addOrder(int accountID, String name, String address, String email, String phone, String note, Cart cart) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        int orderID = 0;
        try {
            // add order
            String sql = "INSERT INTO [dbo].[Order]\n"
                    + "           ([Account_ID]\n"
                    + "           ,[Order_Date]\n"
                    + "           ,[CustomerName]\n"
                    + "           ,[Address]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Email]\n"
                    + "           ,[TotalMoney]\n"
                    + "           ,[Order_Note]\n"
                    + "           ,[Order_Status])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, accountID);
            ps.setString(2, date);
            ps.setString(3, name);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setDouble(7, cart.getTotalPrice());
            ps.setString(8, note);
            ps.setInt(9, 1);
            ps.executeUpdate();

            // take orderID
            String sql1 = "SELECT TOP 1 [Order_ID]\n"
                    + "      ,[Account_ID]\n"
                    + "      ,[Order_Date]\n"
                    + "      ,[CustomerName]\n"
                    + "      ,[Address]\n"
                    + "      ,[Phone]\n"
                    + "      ,[Email]\n"
                    + "      ,[TotalMoney]\n"
                    + "      ,[Order_Note]\n"
                    + "      ,[Order_Status]\n"
                    + "  FROM [PROJECT_SWP391_SUMMER2022].[dbo].[Order]\n"
                    + "  order by Order_ID desc";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            rs = ps1.executeQuery();

            if (rs.next()) {
                orderID = rs.getInt(1);
                for (Item i : cart.getItem()) {
                    String sql2 = "INSERT INTO [dbo].[OrderDetail]\n"
                            + "           ([Order_ID]\n"
                            + "           ,[Product_ID]\n"
                            + "           ,[Quantity]\n"
                            + "           ,[Price])\n"
                            + "     VALUES\n"
                            + "           (?\n"
                            + "           ,?\n"
                            + "           ,?\n"
                            + "           ,?)";
                    PreparedStatement ps2 = connection.prepareStatement(sql2);
                    ps2.setInt(1, orderID);
                    ps2.setInt(2, i.getProduct().getId());
                    ps2.setInt(3, i.getQuantity());
                    ps2.setDouble(4, i.getPrice());
                    ps2.executeUpdate();
                }
            }
            // update quantity of product
            String sql3 = "UPDATE [dbo].[Product]\n"
                    + "SET [Product_Quantity] = Product_Quantity - ?\n"
                    + "WHERE Product_ID = ?";
            PreparedStatement ps3 = connection.prepareStatement(sql3);
            for (Item i : cart.getItem()) {
                ps3.setInt(1, i.getQuantity());
                ps3.setInt(2, i.getProduct().getId());
                ps3.executeUpdate();
            }

        } catch (Exception e) {
        }
        return orderID;
    }

    public static void main(String[] args) {
        ProductDAO p = new ProductDAO();
        List<Product> list = p.listProPaging(1);
        int total = p.getTotalProduct();
        System.out.println(list.get(0).toString());
    }

    public List<OrderDetail> getOrderDetail(int orderID ) {
        String sql = "select od.Order_ID, p.Product_Name, p.Product_SalePrice, od.Quantity, p.Product_ImgURL from OrderDetail od\n"
                + "join Product p on p.Product_ID = od.Product_ID\n"
                + "where Order_ID = ?";
        List<OrderDetail> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new OrderDetail(orderID,
                        rs.getString(2), 
                        rs.getDouble(3),
                        rs.getInt(4), 
                        rs.getString(5)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

}
