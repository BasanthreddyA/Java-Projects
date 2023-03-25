import  javax.servlet.*;
import java.io.*;
public  class NetServlet extends  GenericServlet{
    public void  service(ServletRequest req,ServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        try{
            float gs=(float)req.getAttribute("gr");
            float ded=gs*0.04f;
            float ns=gs-ded;

            out.println("<html><body bgcolor=pink text=blue>");
            out.println("<center><h1>");
            out.println("Gross Salary : "+gs);
            out.println("<br>Deductions : "+ded);
            out.println("<br>Net Salary :"+ns);
            out.println("</body></html>");
            out.close();

        }catch (Exception e){
            out.println(e);
        }
    }
}