import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/PizzaOrderServlet")
public class PizzaOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("topping");
        String address = request.getParameter("address");

        System.out.println("crust: " + crust);
        System.out.println("sauce: " + sauce);
        System.out.println("size: " + size);
//        System.out.println("topping: " + topping);
        System.out.println("address: " + address);

        // do some processing here...


            // get response writer
            PrintWriter writer = response.getWriter();

            // build HTML code
            String htmlResponse = "<html>";
            htmlResponse += "<h2>Your crust is: " + crust + "<br/>";
            htmlResponse += "Your sauce is: " + sauce + "<br/>";
            htmlResponse += "Your size is: " + size + "<br/>";
        for(String topping : toppings ) {
            System.out.println(topping);
            htmlResponse += "Your toppings are: " + topping + "<br/>";
        }
            htmlResponse += "Your delivery address is: " + address + "<br/>";
            htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);
//        request.setAttribute("username", username);
//        request.setAttribute("password", password);
//        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String pizza = request.getParameter("pizza");
//
//        request.setAttribute("pizza", pizza);
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}
