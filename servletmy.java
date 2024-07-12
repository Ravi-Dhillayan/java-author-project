package in.dp.backand;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class servletmy extends HttpServlet{
 /**
	 * 
	 */
	private static final long serialVersionUID = -5346857496538640159L;

protected void doGet(HttpServlet req,HttpServlet resp) throws ServletException,IOException
 {
	System.out.println("I am In doGet() Method "); 
 }
}
