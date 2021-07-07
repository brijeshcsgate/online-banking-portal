import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class user_entry extends HttpServlet {

    String uname,email,uaddress,pin,login,pasword,uphone,cv;
    int balance,account_no;
//    String uphone;
    Connection con;
    PreparedStatement ps,ps1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            LocalDate myObj = LocalDate.now();  // Create a date object
    
        uname = request.getParameter("name");
        uphone = request.getParameter("phone");
       email= request.getParameter("email");
      uphone = request.getParameter("phone");
        uaddress = request.getParameter("address");
      pin = request.getParameter("pin");
      login=request.getParameter("phone")+myObj;
      cv=login;
      pasword=request.getParameter("email")+myObj;
      String pass=pasword;
      balance=0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app", "root", "");
            //  ps=con.prepareStatement("insert into person values('"+ username+"','"+password+"','"+phone+"','"+email+"')");
            ps = con.prepareStatement("insert into customer(login,pasword,uname,uphone,email,uaddress,pin,balance) values(?,?,?,?,?,?,?,?)");
             ps1 = con.prepareStatement("insert into login(u_name,u_pass) values(?,?)");
          
            ps.setString(1,login );
            ps.setString(2,pasword );
            ps.setString(3,uname );
            ps.setString(4,uphone);
            ps.setString(5, email);
            ps.setString(6, uaddress);
             ps.setString(7, pin);
            ps.setFloat(8,balance);
           ps1.setString(1,login );
            ps1.setString(2,pasword );
            
            ps.executeUpdate();
             ps1.executeUpdate();
     //    
     //       out.println("Category Addded successfully");
           Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select login,pasword,uname,uphone,email,account_no,uaddress,pin,balance from customer where login='"+cv+"'and pasword='"+pass+"';");
             out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>JSP Page</title>\n" +
"        <link rel=\"stylesheet\" href=\"banking.css\">\n" +
"        <style>\n" +
"h1 {\n" +
"  text-align: center;  font-family: forte; color:red;\n" +
"}\n" +
"\n" +
"h2 {\n" +
"  text-align: left;color:yellow;\n" +
"}\n" +
"\n" +
"h3 {\n" +
"  text-align: left;background-color: lightcyan;center;font-size:40px\n" +
"}\n" +
"\n" +
"label{\n" +
"     text-align: left;color:yellow;\n" +
"}\n" +
"\n" +
"h4{\n" +
"  text-align: left;color:yellow;\n" +
"}\n" +
"\n" +
"</style>\n" +
"\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"<div class=\"header\">\n" +
" \n" +
"  <a href=\"#default\" class=\"logo\">\n" +
"      <img src=\"images.jpg\"  width=\"50px\" height=\"60px\" style=\"border-radius:50px;\" align=\"left\">\n" +
"\n" +
"      <h1> <b style=\"font-size:70px;  font-family: forte; color:red;\">O</b>\n" +
" <b style=\"font-size:70px;  font-family: forte; color:dodgerblue;\">B</b>\n" +
" <b style=\"font-size:70px;  font-family: forte; color:slateblue;\">P</b>\n" +
" <b style=\"font-size:40px;  font-family: forte; color:green;\"><u>Online Banking Portal</u></b></h1>\n" +
" \n" +
"  </a>" +" <div class=\"header-right\">\n" +
"    \n" +
"  </div>\n" +

"</div>\n" +
"\n" +
"<div class=\"topnav\">\n" +
"  <a href=\"index.jsp\">Home</a>\n" + 
 


"  <a href=\"aboutus.jsp\">About Us</a>\n" +
"   <a href=\"contact.jsp\">Contact Us</a>\n" +
"</div>\n" +
"\n" +
"<div class=\"row\">\n" +
"  <div class=\"column side\" >  <a href=\"login2.jsp\">   <h2>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&diams;Do Transactions</h2><br></a>\n" +
"     \n" +
"     <a href=\"login2.jsp\">   <h2>&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp&diams;Money Transfer</h2><br></a>\n" +
"       <a href=\"login2.jsp\">  <h2>&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp&diams;Pay Bills</h2></a>\n" +
"  </div>\n" +
"  \n" +
"  <div class=\"column middle\"><article class=\"bg-img2\">\n" +
"  <div class=\"header-right\">\n" +
"   \n" +
"   \n" +
"  </div>\n" +
"      \n" +
"      \n" );
               out.println("<h2>SUCCESSFULLY ACCOUNT CREATED</h2>");
             out.println("<table border=1 width=50% height=50%>  ");  
             while (rs.next()) 
             {  
                 String a = rs.getString("login");  
                 String b = rs.getString("pasword"); 
                 String c = rs.getString("uname"); 
                 String d = rs.getString("uphone"); 
                 String e = rs.getString("email"); 
                 int  f = rs.getInt("account_no"); 
                 String g = rs.getString("uaddress"); 
                 String h = rs.getString("pin"); 
                 int i = rs.getInt("balance");   
                
                 out.println("<h1><tr>User Name:" + a + "</tr><br><tr>Password:" + b + "</tr><br><tr>Name of Customer" + c + "</tr><br>"
                         + "<tr>Phone No" + d + "</tr><br><tr>Email:" + e+ "</tr><br><tr>Account Number:" + f + "</tr><br>"
                                 + "<tr>Address:" + g + "</tr><br><tr>PINCODE:" + h + "</tr><br><tr>Balance:" +i + "</tr><br></h1>");   
             }  
             out.println("</table>");   
             out.println(
"      </article>\n" +
"      \n" +
" </div> </div>\n" +
"<div class=\"footer\">\n" +
"  <p>Footer</p>\n" +
"</div>\n" +
"\n" +
"    </body>\n" +
"</html>\n" +
""); 
           
         //    out.println("</body></html>");  
             con.close();  
        } catch (Exception e) {
 out.println("Error while inserting data->" + e.getMessage());

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
