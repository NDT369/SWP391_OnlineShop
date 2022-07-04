/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        String sql = "  select * from Product p\n"
                + " join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + " join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_Status = 1";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllProductManage() {
        List<Product> list = new ArrayList<>();
        String sql = "  select * from Product p\n"
                + " join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + " join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
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
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_Status = 1";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));

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
                + "join Card car on p.Card_ID = car.Card_ID "
                + "where p.Product_Status = 1"
                + "order by Product_ID DESC";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
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
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_Status = 1 "
                + "and cat.Category_Name = '" + cate + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByID(String id) {
        Product p = null;
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
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18));

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
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18));
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
                + "join Card car on p.Card_ID = car.Card_ID "
                + "where p.Product_Status = 1 "
                + "order by Product_ID offset ? row fetch next 9 rows only";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 9);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
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

    public List<Product> filter(String cate, String brand, String display, String cpu) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p  \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID \n"
                + "where 1=1 and p.Product_Status = 1";
        if (cate != null && cate != "") {
            sql += "and cat.Category_Name = '" + cate + "' ";
        }
        if (brand != null && brand != "") {
            sql += "and b.Brand_Name = '" + brand + "' ";
        }
        if (display != null && display != "") {
            sql += "and d.Display_Name = '" + display + "' ";
        }
        if (cpu != null && cpu != "") {
            sql += "and  cpu.CPU_Name = '" + cpu + "' ";
        }
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand b = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU c = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display d = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        b, category, os, ram, c, d, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> sortPro(String choice, List<Product> list) {
        Collections.sort(list, (Product p1, Product p2) -> {
            if (choice.equals("1")) {
                return p1.getPrice() > p2.getPrice() ? 1 : -1;
            }
            if (choice.equals("2")) {
                return p1.getPrice() > p2.getPrice() ? -1 : 1;
            }
            if (choice.equals("3")) {
                return p1.getName().compareTo(p2.getName());
            }
            if (choice.equals("4")) {
                return p2.getName().compareTo(p1.getName());
            }

            return p1.getCreatedate().compareTo(p2.getCreatedate());
        });
        return list;
    }

    public List<Product> fulltextSearch(String search) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID\n"
                + "where freetext(p.Product_Name, '\"*" + search + "*\"') or\n"
                + "freetext(p.Product_Description, '\"*" + search + "*\"')";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        ProductDAO p = new ProductDAO();
        Product list = p.getProductByID(1);
        System.out.println(list.getName());
    }

    public List<OrderDetail> getOrderDetail(int orderID) {
        String sql = "select od.Order_ID, p.Product_Name, p.Product_SalePrice, od.Quantity, p.Product_ImgURL from OrderDetail od\n"
                + "join Product p on p.Product_ID = od.Product_ID\n"
                + "where Order_ID = ?";
        List<OrderDetail> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();
            while (rs.next()) {
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

    public List<Brand> getAllBrand() {
        String sql = "select * from Brand";
        List<Brand> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand b = new Brand();
                b.setId(rs.getInt(1));
                b.setName(rs.getString(2));
                b.setStatus(rs.getBoolean(3));
                list.add(b);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<CPU> getAllCPU() {
        String sql = "select * from CPU";
        List<CPU> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CPU c = new CPU();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setStatus(rs.getBoolean(3));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Capacity> getAllCapacity() {
        String sql = "select * from Capacity";
        List<Capacity> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Capacity c = new Capacity();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setStatus(rs.getBoolean(3));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Card> getAllCard() {
        String sql = "select * from Card";
        List<Card> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Card c = new Card();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setStatus(rs.getBoolean(3));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        String sql = "select * from Category";
        List<Category> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setStatus(rs.getBoolean(3));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Display> getAllDisplay() {
        String sql = "select * from Display";
        List<Display> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Display d = new Display();
                d.setId(rs.getInt(1));
                d.setName(rs.getString(2));
                d.setStatus(rs.getBoolean(3));
                list.add(d);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<OperatingSystem> getAllOS() {
        String sql = "select * from OperatingSystem";
        List<OperatingSystem> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                OperatingSystem o = new OperatingSystem();
                o.setId(rs.getInt(1));
                o.setName(rs.getString(2));
                o.setStatus(rs.getBoolean(3));
                list.add(o);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<RAM> getAllRAM() {
        String sql = "select * from RAM";
        List<RAM> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RAM r = new RAM();
                r.setId(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setStatus(rs.getBoolean(3));
                list.add(r);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addNewProduct(Product p) {
        String sql = "insert into Product values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,1)";
        p.setSaleprice(p.getPrice() - p.getPrice() * p.getDiscount());
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());
            ps.setFloat(3, p.getDiscount());
            ps.setDouble(4, p.getSaleprice());
            ps.setInt(5, p.getQuantity());
            ps.setString(6, p.getImgURL());
            ps.setString(7, p.getDescription());
            ps.setInt(8, p.getBrand().getId());
            ps.setInt(9, p.getCategory().getId());
            ps.setInt(10, p.getOs().getId());
            ps.setInt(11, p.getRam().getId());
            ps.setInt(12, p.getCpu().getId());
            ps.setInt(13, p.getDisplay().getId());
            ps.setInt(14, p.getCapacity().getId());
            ps.setInt(15, p.getCard().getId());
            ps.setString(16, p.getCreatedate());
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public List<Product> getListProductByBrandIdOrStatus(String brandid, String status) {
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where 1=1";
        if (brandid != null && brandid != "") {
            int id = Integer.parseInt(brandid);
            sql += "and p.Brand_ID = " + id;
        }
        if (status != null && status != "") {
            int s = Integer.parseInt(status);
            sql += "and p.Product_Status =" + s;
        }
        List<Product> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getListProductByStatus(int status) {
        String sql = "select * from Product p \n"
                + "join Brand b on p.Brand_ID = b.Brand_ID\n"
                + "join Category cat on p.Category_ID = cat.Category_ID\n"
                + "join OperatingSystem o on p.OS_ID = o.OS_ID\n"
                + "join RAM r on p.RAM_ID = r.RAM_ID\n"
                + "join CPU cpu on p.CPU_ID = cpu.CPU_ID\n"
                + "join Display d on p.Display_ID = d.Display_ID\n"
                + "join Capacity cap on p.Capacity_ID = cap.Capacity_ID\n"
                + "join Card car on p.Card_ID = car.Card_ID where p.Product_Status = ?";
        List<Product> list = new ArrayList<>();

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, status);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt(19), rs.getString(20), rs.getBoolean(21));
                Category category = new Category(rs.getInt(22), rs.getString(23), rs.getBoolean(24));
                OperatingSystem os = new OperatingSystem(rs.getInt(25), rs.getString(26), rs.getBoolean(27));
                RAM ram = new RAM(rs.getInt(28), rs.getString(29), rs.getBoolean(30));
                CPU cpu = new CPU(rs.getInt(31), rs.getString(32), rs.getBoolean(33));
                Display display = new Display(rs.getInt(34), rs.getString(35), rs.getBoolean(36));
                Capacity capaciry = new Capacity(rs.getInt(37), rs.getString(38), rs.getBoolean(39));
                Card card = new Card(rs.getInt(40), rs.getString(41), rs.getBoolean(42));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3),
                        rs.getFloat(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8),
                        brand, category, os, ram, cpu, display, capaciry, card,
                        rs.getString(17), rs.getBoolean(18)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void UpdateProductStatus(int status, int id) {
        String sql = "update Product set Product_Status = ? where Product_ID = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateProduct(Product p) {
        String sql = "update Product set Product_Name = ?, Product_Price = ?, Discount = ?, Product_SalePrice = ?, Product_Quantity = ?, Product_ImgURL = ?\n"
                + ", Product_Description = ?, Brand_ID = ?,Category_ID = ?, OS_ID = ?, RAM_ID = ?, CPU_ID = ?, Display_ID = ?, Capacity_ID = ?, Card_ID = ?, "
                + "Product_CreateDate = ?, Product_Status = ?\n"
                + "where Product_ID = ? ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());
            ps.setFloat(3, p.getDiscount());
            ps.setDouble(4, p.getSaleprice());
            ps.setInt(5, p.getQuantity());
            ps.setString(6, p.getImgURL());
            ps.setString(7, p.getDescription());
            ps.setInt(8, p.getBrand().getId());
            ps.setInt(9, p.getCategory().getId());
            ps.setInt(10, p.getOs().getId());
            ps.setInt(11, p.getRam().getId());
            ps.setInt(12, p.getCpu().getId());
            ps.setInt(13, p.getDisplay().getId());
            ps.setInt(14, p.getCapacity().getId());
            ps.setInt(15, p.getCard().getId());
            ps.setString(16, p.getCreatedate());
            ps.setBoolean(17, p.isStatus());
            ps.setInt(18, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
