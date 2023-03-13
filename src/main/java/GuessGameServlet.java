import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessGameServlet", value = "/guess")
public class GuessGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guessing.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int rand = random.nextInt(3-1) + 1;
        String userGuess = request.getParameter("guess");
        String method = request.getMethod();
            if (Integer.parseInt(userGuess) == rand) {
                response.sendRedirect("/correct");
            }else{
                response.sendRedirect("/incorrect");
            }
    }

}
