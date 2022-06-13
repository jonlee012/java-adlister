import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;




@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!!!!</h1>"+"<h2>How are you?</h2>");

    }
}
