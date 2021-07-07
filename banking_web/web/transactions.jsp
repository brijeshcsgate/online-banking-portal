
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="banking.css">
        <style>
h1 {
  text-align: center;font-size:40px;  font-family: forte; color:red;
}

h2 {
  text-align: left;color:yellow;
}

ul{ 
 text-align: left;font-size:20px;  font-family: Times New Roman; color:blue;
}
h5{
  text-align: left;font-size:40px;color:black;
}

h4{
  text-align: left;color:yellow;font-size:30px;
}
h3{
    text-align: left;color:black;font-size:30px;
}
label{
    width:300px;height:35px;
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
  <li></ul>
  </div>
  
  <div class="column middle"><article class="bg-img2">
  <div class="header-right">
   
   
  </div>
      
      
       <form action="transactions">
  <div class="container">
    
      <h3>Perform Transaction <br></h3>
    
<h4>
    <label for="amount">Amount</label>
    <input type="text" id="amount" name="amount" value="">
   <label for="accountno">AccoutNO</label>
  <input type="number" id="account" name="account" value="">
 
</h4><br>
  <h3> What do you want:--</h3>
<h4> <input type="radio" id="withdrowl" name="transaction" value="withdrowl">
 <label for="withdrowl">withdrowl</label>&nbsp;&nbsp;
  <input type="radio" id="deposit" name="transaction" value="deposit">
  <label for="deposit">Deposit</label>&nbsp;&nbsp;
  <input type="radio" id="transfer" name="transaction" value="transfer">
  <label for="transfer">Transfer/Pay</label><br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;
    <label for="accountno2">AccoutNO[in which transfer amount]</label>
  <input type="number" id="account2" name="account2" value=""><br>
 

    <button type="submit" class="registerbtn">Submit</button>
    <button type="reset" class="registerbtn">Reset</button> </h4>
  </div>
</form> 
      </article>
      
 </div> </div>
<div class="footer">
 <%@include file="footer.jsp"%>
</div>

    </body>
</html>
