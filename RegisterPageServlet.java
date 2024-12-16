import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/register")
public class RegisterPageServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobileNo = req.getParameter("mobile");
		String address = req.getParameter("address");
		String male = req.getParameter("male");  
		String female = req.getParameter("female");
		String DOB = req.getParameter("DOB");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("Country");
		String age = req.getParameter("age");
		String degree = req.getParameter("degree");
		String passOut = req.getParameter("passing");
		String pass = req.getParameter("Password");

		PrintWriter out = res.getWriter();
		
//		display the values on the browser
		
		out.println(firstName);
		out.println(lastName);
		out.println(email);
		out.println(mobileNo);
		out.println(address);
		out.println(male);
		out.println(female);
		out.println(DOB);
		out.println(city);
		out.println(state);
		out.println(country);
		out.println(age);
		out.println(degree);
		out.println(passOut);
		out.println(pass);

//		Display the values on the console 
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(mobileNo);
		System.out.println(email);
		System.out.println(address);
		System.out.println(male);
		System.out.println(female);
		System.out.println(DOB);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(age);
		System.out.println(degree);
		System.out.println(passOut);
		System.out.println(pass);
	}
}
