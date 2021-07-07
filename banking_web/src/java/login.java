
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
      Connection con;
    Statement ps;
String cust,adm;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String log=request.getParameter("logint");
        
        String u_name=request.getParameter("login");
        String u_pass=request.getParameter("psw");
        cust="customer";
        adm="admin";
try{
        Class .forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app","root","");
   if(log.equals(cust)){
         PreparedStatement ps = con.prepareStatement("select u_name,u_pass from login where u_name=? and u_pass=?");
            ps.setString(1, u_name);
            ps.setString(2, u_pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                response.sendRedirect("transactions.jsp");
                return;
            }
   }
   else if(log.equals(adm))
           {
            PreparedStatement ps = con.prepareStatement("select u_name,u_pass from login where u_name=? and u_pass=?");
            ps.setString(1, u_name);
            ps.setString(2, u_pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                response.sendRedirect("admin.jsp");
                return;
            }
           }
            response.sendRedirect("index.jsp");
            return;
}
catch (ClassNotFoundException | SQLException e) {
 out.println("Error while inserting data->" + e.getMessage());

        }    }

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
        processRequest(request, response);
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
