
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ViewColorServlet", urlPatterns = "/ViewColorServlet")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String login = request.getParameter("view-color");
//
//        request.setAttribute("view-color", login);
//        request.getRequestDispatcher("/view-color.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");
        System.out.println("User color: " + color);

        request.setAttribute("color", color);
        request.getRequestDispatcher("/view-color.jsp").forward(request, response);
    }
}