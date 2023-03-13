import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessGameServlet", value = "/guess")
public class GuessGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guessing.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = "2";
        String userGuess = request.getParameter("guess");
        String method = request.getMethod();
        if(method.equals("POST")) {
            if (userGuess.equals(number)) {
                response.sendRedirect("/correct");
            }else{
                response.sendRedirect("/incorrect");
            }
        }
    }
}
