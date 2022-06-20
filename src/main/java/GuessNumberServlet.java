import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessNumberServlet", urlPatterns = "/GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int userNum = Integer.parseInt(req.getParameter("number"));
        System.out.println(userNum);

        int min = 1;
        int max = 3;
        int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);

        if (userNum == randomNum) {
            res.sendRedirect("/correct");
        } else if (userNum > 3 || userNum < 1) {
            res.sendRedirect("guess.jsp");
        } else {
            res.sendRedirect("/incorrect");
        }


        // Above solution can also be accomplished using the code below which only utilizes two JSPs and one servlet!
//        if (userNum == randomNum) {
//            req.setAttribute("message", "You win!");
//            req.getRequestDispatcher("/view-guess.jsp").forward(req, res);
//        } else if (userNum > 3 || userNum < 1) {
//            res.sendRedirect("guess.jsp");
//        } else {
//            req.setAttribute("message", "You lose!");
//            req.getRequestDispatcher("/view-guess.jsp").forward(req, res);
//        }
    }

}