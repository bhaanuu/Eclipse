
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
String email = request.getParameter("email");
String pass = request.getParameter("pass");
PrintWriter out=response.getWriter();
if(email.equals("name@gmail.com") && pass.equals("name")) {
HttpSession session = request.getSession();
session.setAttribute("email", email);
response.sendRedirect("dashboard");
}
else {

	out.println("<br/><h3><a href=\"login.html\">Enter correct login details</h3></a>"); 
  

}
}
}

