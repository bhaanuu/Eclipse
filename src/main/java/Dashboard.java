
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
response.setContentType("text/html");
PrintWriter out = response.getWriter();
 
HttpSession session = request.getSession(false);
 
if(session != null) {
String email = (String) session.getAttribute("email");
out.print("Welcome " + email);
out.println("<br/><a href=\"logout\">Logout</a>");
out.println("<br/><a href=\"dashboard\">dashboard</a>");


}
else {
	
	out.println("<br/><a href=\"login.html\">Enter login details</a>"); 

}
out.close();
}
}