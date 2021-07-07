
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
 <%@include file="header_admin.jsp"%></div>

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
  <li></ul>
  </div>
  
  <div class="column middle"><article class="bg-img2">
  <div class="header-right">
   
   
  </div>
       <h1 >This is Admin Panel</h1><br>
        <a href="customer.jsp">   <h2>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&diams;Customers and Account Details</h2><br></a>
      
       <a href="login2.jsp">   <h2>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&diams;Do Transactions</h2><br></a>
      <a href="login2.jsp">   <h2>&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp&diams;Money Transfer</h2><br></a>
       <a href="login2.jsp">  <h2>&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp&diams;Pay Bills</h2></a>
</article>
      
 </div> </div>
<div class="footer">
  <%@include file="footer.jsp"%>
</div>

    </body>
</html>
