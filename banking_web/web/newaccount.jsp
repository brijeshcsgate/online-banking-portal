
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
  text-align: left;
}

label{
     text-align: left;color:yellow;
}

h4{
  text-align: left;color:yellow;
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
  <li></ul>
    </div>
  
  <div class="column middle"><article class="bg-img2">
  <div class="header-right">
   
   
  </div>
      
      
       <form action="user_entry">
  <div class="container">
    
      <h3>Please fill in this form to create an account </h3>
    

    <label for="name"> Name</label>
  <input type="text" id="name" name="name" value=""><br>
  <label for="phone">phone</label>
  <input type="text" id="phone" name="phone" value="" pattern="[6789]{1}[0-9]{9}"><br>
   <label for="email">email</label>
  <input type="text" id="email" name="email" value=""><br>
   <label for="adress">address</label>
  <input type="text" id="address" name="address" value=""><br>
   <label for="pin">pin</label>
  <input type="text" id="pin" name="pin" value="">


 <h4>  By creating an account you agree to our <a href="#">Terms & Privacy</a></h4>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form> 
      </article>
      
 </div> </div>
<div class="footer">
  <%@include file="footer.jsp"%>
</div>

    </body>
</html>
