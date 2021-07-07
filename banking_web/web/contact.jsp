
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
      <section >
   <fieldset>
  <legend>Personalia:</legend>
   

  
  <article style="background-color: lightcyan;width:850px" >
      
      <h2>Contact Us</h2>
      <h4>Brijesh Maurya</h4>
            <h4> For Advertisement Email us at </h4>
     info@epea.com<br><br><br>
     mauryabrijesh34@gmail.com
    <h3> Lucknow Office</h3>
    Plot -339 Daud Nagar FaijullahGanj
     Lucknow ,Uttar Pradesh 226020.
           </fieldset>
      </article>
     </section>
</article>
      
 </div> </div>
<div class="footer">
   <%@include file="footer.jsp"%>
</div>

    </body>
</html>















