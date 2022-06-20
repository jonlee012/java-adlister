import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;




@WebServlet(name = "HelloWorldServlet", urlPatterns = "/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
//    public String sayHello (String name){
//        return "Hello " + name + "!";
//    }
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Hello, + name </h1>"+"<h2>How are you?</h2>");
//
//    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        // if the name is null, it means that "name" was not present in the query
        // string, and here we'll provide a default value
        if (name == null) {
            name = "World!";
        } else if (name.equals("bgates")) {
            response.sendRedirect("https://microsoft.com");
            return;
        }
        // pass the value of the name variable to the view, and send the request
        // forward to the hello.jsp file
        request.setAttribute("name", name);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }


}
