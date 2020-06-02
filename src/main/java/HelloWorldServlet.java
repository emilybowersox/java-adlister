import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
        String name = req.getParameter("name");

        if(name == null){
            out.println("<h6>Hello world!</h6>");;
        }else {
            out.println("<h6>Hello " + name + "!</h6>");
        }
    }
}


//have to restart server the first time to the launch the page, after that use "redeploy" to recompile(?)