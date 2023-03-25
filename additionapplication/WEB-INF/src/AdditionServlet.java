import javax.servlet.*;
import java.io.*;
public class AdditionServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException{
	    
	String s1=req.getParameter("t1");
	String s2=req.getParameter("t2");
	
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	
	    int z=x+y;
	    
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	     out.println("<html>");
	     out.println("<body bgcolor=yellow text=blue");
	  out.println("<h1> The sum is:"+z);
	     out.println("</body></html>");
	  out.close();
	
	}
}
