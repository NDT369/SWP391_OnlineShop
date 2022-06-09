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
import model.Account;
import model.Brand;
import model.CPU;
import model.Capacity;
import model.Card;
import model.Category;
import model.Display;
import model.OperatingSystem;
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

    public static void main(String[] args) {
        ProductDAO p = new ProductDAO();
        List<Product> list = p.listProPaging(1);
        int total = p.getTotalProduct();
        System.out.println(list.get(0).toString());
    }
}
