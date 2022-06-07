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
import model.Blog;

/**
 *
 * @author Pham Minh Giang
 */
public class BlogDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public List<Blog> getAll() {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from  Blog";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Blog getBlogByID(String id) {
        Blog blog = new Blog();
        String sql = "select * from  Blog where Blog_ID = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                blog = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8));
            }
        } catch (Exception e) {
        }
        return blog;
    }

    public List<Blog> SearchBlog(String search) {
        List<Blog> list = new ArrayList<>();
        String sql = "SELECT * FROM Blog where Title like '%" + search + "%' or Content like '%" + search + "%'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8)));
            }
        } catch (Exception e) {
        }
        return list;

    }

}
