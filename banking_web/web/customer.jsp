<%@page import="DBConfig.JDBCFile"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet rs=null;
    try{
    rs=JDBCFile.executeQuery("select * from customer");
    }
    
    catch(Exception ex){
        ex.printStackTrace();
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="banking.css">
        <style>
h1 {
  text-align: center;font-size:60px;  font-family: forte; color:red;
}

h2 {
  text-align: left;color:yellow;
}

h3 {
  text-align: right;
}
ul{ 
 text-align: left;font-size:20px;  font-family: Times New Roman; color:blue;
}
</style>

    </head>
    <body>
        
<div class="header">
  <%@include file="header_admin.jsp"%>
</div>

<div class="topnav">
  <a href="index.jsp">Home</a>
  <a href="aboutus.jsp">About Us</a>
  <a href="contact.jsp">Contact Us</a>
</div>

<div class="row">
  <div class="column side" ><img src="images3.jpg" style="width:100%; height:150px">
    
    <ul>
  <li>
Pradhan Mantri Jan Dhan Yojana (PMJDY)</li>
  <li>

Pradhan Mantri Jeevan Jyoti Bima Yojana (PMJJBY)</li>
  <li>
Pradhan Mantri Suraksha Bima Yojana (PMSBY)</li>
  <li>
Atal Pension Yojana (APY)</li>
  <li>
Pradhan Mantri Mudra Yojana</li>
  <li>
Stand Up India Scheme</li>
  <li>
Pradhan Mantri Vaya andana Yojana</li>
  </ul>
  </div>
  
  <div class="column middle"><article class="bg-img2">
  <div class="header-right">
   
   
  </div>
       <h1 >This is Admin Panel</h1><br>
      
<section >
   
   

  
    <article style=" background-color: lightblue;"> <fieldset>
            <legend><h2>CUSTOMER INFORMATION
                <a href="admin.jsp">
                    <button class="btn1 user" ><b>BACK  &LeftArrow;</b></button>
                </a>
              
                </h2>
            
            </legend><table border="0px">
            
            <tr>
                <th>Name</th>
                <th>Phone NO</th>
                <th>E-mail</th>
                <th>Account No</th>
                <th>Address</th>
                <th>Pin</th>
                <th>Balance</th>
                
            </tr>
            <%while(rs.next()){%>
            
            <tr>
                <td><% out.print(rs.getString(3)); %></td>
                <td><% out.print(rs.getString(4)); %></td>
                  <td><% out.print(rs.getString(5)); %></td>
                    <td><% out.print(rs.getString(6)); %></td>
                <td><% out.print(rs.getString(7)); %></td>
                
                <td><% out.print(rs.getString(8)); %></td>
                <td><% out.print(rs.getString(9)); %></td>
                
                </tr>
            <% }rs.close();JDBCFile.closeAll(); %>
        </table>
        </fieldset>
        </article>>
     </section>
</article>
      
 </div> </div>
<div class="footer">
  <%@include file="footer.jsp"%>
</div>

    </body>
</html>







