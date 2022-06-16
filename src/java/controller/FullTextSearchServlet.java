/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BrandDAO;
import dal.CPUDAO;
import dal.CategoryDAO;
import dal.DisplayDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Brand;
import model.CPU;
import model.Category;
import model.Display;
import model.Product;

/**
 *
 * @author Pham Minh Giang
 */
public class FullTextSearchServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FullTextSearchServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FullTextSearchServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        ProductDAO p = new ProductDAO();
        CategoryDAO cate = new CategoryDAO();
        BrandDAO b = new BrandDAO();
        DisplayDAO d = new DisplayDAO();
        CPUDAO cpu = new CPUDAO();

        List<Category> categoryList = cate.getAll();
        List<Brand> brandList = b.getAll();
        List<Display> displayList = d.getAll();
        List<CPU> cpuList = cpu.getAll();

        session.setAttribute("cpuList", cpuList);
        session.setAttribute("displayList", displayList);
        session.setAttribute("brandList", brandList);
        session.setAttribute("categoryList", categoryList);

        String search = request.getParameter("search");
        String index_raw = request.getParameter("index");

        List<Product> productList = p.fulltextSearch(search);
        int total = productList.size();
        int page = total / 9;
        if (total % 9 != 0) {
            page += 1;
        }
        if (index_raw == null) {
            index_raw = "1";
        }
        int index = Integer.parseInt(index_raw);
        int start = (index-1)*9;
        int end = Math.min((index*9), total);

        session.setAttribute("productList", productList.subList(start, end));
        request.setAttribute("index", index);
        request.setAttribute("page", page);
        request.setAttribute("search", search);
        request.getRequestDispatcher("productsearch.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
