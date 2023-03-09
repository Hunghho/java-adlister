import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CountServlet", value = "/count")
public class CountServlet extends HttpServlet {
    private int hitCount;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;
        String reset = request.getParameter("reset");
        if(reset != null){
            hitCount = 0;
        }
        response.getWriter().println("Hit count visited: " + hitCount);

    }
}
