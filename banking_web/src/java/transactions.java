
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
                                                                           
import java.util.Enumeration;
                                                                           
import java.io.PrintWriter;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
                                                                           
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;/*
                                                                           
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.jms.JMSException;
import javax.jms.QueueSession;
import javax.jms.QueueBrowser;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
                                                                           
import com.sssw.jms.api.JMQQueue;
import com.sssw.jms.api.JMQQueueConnectionFactory        */
public class transactions extends HttpServlet {


    String utransaction,uamount,uaccount,uaccount2,withdr,deposit,tansfr;/*  declare variables
     private static final String _iiop =
        JMQQueueConnectionFactory.IIOP_PROTOCOL;
                                                                           
    private String       _message;
    private QueueSession _session;
                                                                           
    public void init()
    
       try
       {
          QueueConnectionFactory connFactory =
           new JMQQueueConnectionFactory(_iiop, "localhost", "", 53506);
       QueueConnection queueConn = connFactory.createQueueConnection();
       _session = queueConn.createQueueSession(false,
           Session.AUTO_ACKNOWLEDGE);
       queueConn.start();
       }
       catch (Exception ex)
       {
       _message = ex2str(ex);
       }
    }
                                                                           
    public static String ex2str(Throwable t)
    {
       try {
          ByteArrayOutputStream os = new ByteArrayOutputStream();
       PrintWriter pw = new PrintWriter(os);
       t.printStackTrace(pw);
       pw.flush();
       return new String(os.toByteArray());
       } catch (Throwable e) {
       return t.toString();
       }
    }                                    */
    Connection con;
    PreparedStatement ps;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          uamount = request.getParameter("amount");
        utransaction = request.getParameter("transaction");
       uaccount= request.getParameter("account");
      
        uaccount2= request.getParameter("account2");
      
       withdr="withdrowl";
      deposit="deposit";
      tansfr="transfer";
int bal=Integer.parseInt(uamount); 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app", "root", "");
            //  ps=con.prepareStatement("insert into person values('"+ username+"','"+password+"','"+phone+"','"+email+"')");
            Statement stmt = con.createStatement();  
               Statement stmt2 = con.createStatement();  
                             out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>JSP Page</title>\n" +
"        <link rel=\"stylesheet\" href=\"banking.css\">\n" +
"        <style>\n" +
"h1 {\n" +
"  text-align: center;font-size:60px;  font-family: forte; color:red;\n" +
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
"   " +
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
    
            if(utransaction.equals(withdr)){
                 ResultSet rs = stmt.executeQuery("select balance from customer where account_no='"+uaccount+"';");
           
             
                     while (rs.next()) 
             {  
              int    i = rs.getInt("balance");   
             
            
               if(i>bal) {
                   int b=i-bal;
                    String sql = "UPDATE customer " +
                   "SET balance ='"+b+"' WHERE  account_no='"+uaccount+"';";
      stmt.executeUpdate(sql);

                   
                   out.println("<h1>withgrwl balance successfully..<br>"
                           + "your balanc is now:---"+b+"</h1>");
            
               } else {
                   out.println("<h1>not sufficient balance..<br>"
                           + "your balanc is now:---"+i+"</h1>");
            
                }
             }
            }
            else if(utransaction.equals(tansfr)){
                ResultSet rs2 = stmt.executeQuery("select balance from customer where account_no='"+uaccount2+"';");
           
             
                     while (rs2.next()) 
             {  
              int    i = rs2.getInt("balance");   
             
            int b=i+bal;
                   String sql = "UPDATE customer " +
              "SET balance ="+b+" WHERE  account_no="+uaccount2;
      stmt.executeUpdate(sql);
              
                   
                 ResultSet rs= stmt.executeQuery("select balance from customer where account_no='"+uaccount+"';");
             while (rs.next()) 
             {  
          int       y = rs.getInt("balance");   
             
   
          
          if(y>bal) {
                   int z=y-bal;
                    String sql2 = "UPDATE customer " +
                   "SET balance ='"+z+"' WHERE  account_no='"+uaccount+"';";
      stmt.executeUpdate(sql2);

                    
                   out.println("<h1>Amount tarnsfered successfully ....<br>"
                           + "your balanc is now:---"+b+"</h1>");
            
               } else {
                   out.println("<h1>not sufficient balance in your account....<br>"
                           + "your balanc is now:---"+i+"</h1>");
            
                }
            
            
               
             }
                }   
            }
           
            else if(utransaction.equals(deposit)){
                 ResultSet rs = stmt.executeQuery("select balance from customer where account_no='"+uaccount+"';");
           
             
                     while (rs.next()) 
             {  
              int    i = rs.getInt("balance");   
             
            int b=i+bal;
                   String sql = "UPDATE customer " +
              "SET balance ="+b+" WHERE  account_no="+uaccount;
      stmt.executeUpdate(sql);

                  out.println("<h1>Money Deposited  Successfuly....<br>"
                           + "your balanc is now:---"+b+"</h1>");
              
                   
                }
              
            }
            else
           
              out.println("<h1>Money no Deposited  Successfuly...</h1>");
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
            
        } catch (ClassNotFoundException | SQLException e) {/*
 out.println("Error while inserting data->" + e.getMessage());*/

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

}/*

public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException
    {
      response.setContentType("text/html");
       PrintWriter writer = response.getWriter();
                                                                          
       writer.println("<html>");
       writer.println("<head>");
       writer.println("<title>JMS Servlet</title>");
       writer.println("</head>");
       writer.println("<body bgcolor=white>");
                                                                          
       writer.println("<h1>Messages on queue/queue0</h1>");
                                                                          
       if (_session == null) {
          writer.println(_message);
       } else {
       try {
       Queue queue = JMQQueue.getQueue("queue0");
       QueueBrowser browser = _session.createBrowser(queue);
       Enumeration _iterator = browser.getEnumeration();
       writer.println("<table>");
       while (_iterator.hasMoreElements()) {
       Message msg = (Message) _iterator.nextElement();
      writer.println("<tr><td>" + msg + "</td></tr>");
       }
       browser.close();
     writer.println("</table>");
     } catch (JMSException ex) {
          writer.println(ex.toString());
       }
     }
                                                                          
       writer.println("</body>");
       writer.println("</html>");
    }/*
*/
