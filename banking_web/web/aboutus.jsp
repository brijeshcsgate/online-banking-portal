
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
h4 {
  text-align: center;font-size:40px;  font-family: forte; color:blue;
}

ul{ 
 text-align: left;font-size:20px;  font-family: Times New Roman; color:blue;
}
</style>

    </head>
    <body>
        
<div class="header">
  <%@include file="header.jsp"%>
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
      <h4><u>About OBP</u>   
           <p>
           OBP is a online banking portal where customer can create<br> account ,deposit money ,withdraw and transfer money <br>
           easily.<br>
           And in the server we use mutual exclusion and synchronization<br> for deadlock free transactions.
           </p></h4></article>
      
 </div> </div>
<div class="footer">
  <%@include file="footer.jsp"%>
</div>

    </body>
</html>






