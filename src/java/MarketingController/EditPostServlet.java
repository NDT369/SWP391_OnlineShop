/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketingController;

import dal.BlogDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Blog;

/**
 *
 * @author Pham Minh Giang
 */
public class EditPostServlet extends HttpServlet {

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
            out.println("<title>Servlet EditPostServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditPostServlet at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("UTF-8");
        String id_raw = request.getParameter("id");
        String title = request.getParameter("title");
        String image = request.getParameter("image");
        String author = request.getParameter("author");
        String content = request.getParameter("content");
        String create = request.getParameter("create");
        String modify = request.getParameter("modify");
        int id = Integer.parseInt(id_raw);
        BlogDAO b = new BlogDAO();
        if (image == null || image.equals("")) {
            image = b.getBlogByID(id_raw).getImgURL();
        }

        b.Update(id, title, image, author, content, create, modify);

        Blog blog = b.getBlogByID(id_raw);

        request.setAttribute("blog", blog);
        request.getRequestDispatcher("Marketing/blogdetail.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        String status_raw = request.getParameter("status");
        String id_raw = request.getParameter("id");
        int id = Integer.parseInt(id_raw);
        int status = 0;
        if (status_raw.equals("Off")) {
            status = 1;
        }
        BlogDAO b = new BlogDAO();
        b.editStatus(status, id);

        List<Blog> listBlog = b.getAll();
        List<String> listAuthor = b.getAllAuthor();

        String index_raw = request.getParameter("index");
        if (index_raw == null) {
            index_raw = "1";
        }
        int index = Integer.parseInt(index_raw);
        int total = listBlog.size();
        int page = total / 5;
        if (total % 5 != 0) {
            page += 1;
        }
        int start = (index - 1) * 5;
        int end = Math.min((index * 5), total);

        session.setAttribute("listAuthor", listAuthor);
        request.setAttribute("check", "list");
        request.setAttribute("index", index);
        request.setAttribute("page", page);
        request.setAttribute("listBlog", listBlog.subList(start, end));
        request.getRequestDispatcher("Marketing/bloglist.jsp").forward(request, response);
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
