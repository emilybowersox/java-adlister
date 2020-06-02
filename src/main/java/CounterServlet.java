import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try {
            if (req.getParameter("reset").equals("1")) {
                counter = 0;
            }
            } catch(NullPointerException ex){
                ex.printStackTrace();
            }

        counter++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Counter: " + counter);

            }
        }

//        to reset to one you would type: http://localhost:8080/count?reset=1
// count is always first- the param goes after the "?"

