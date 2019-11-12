import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ProductDiscount", urlPatterns = "/calculator")
public class ProductDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("description");
        Float price = Float.parseFloat(request.getParameter("price"));
        Float discount = Float.parseFloat(request.getParameter("discount_percent"));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h2>Description: "+product+"<h2>");
        printWriter.println("<h2>Price:"+price+"<h2>");
        printWriter.println("<h2>Discount:"+discount+"<h2>");
        printWriter.println("<h1>: Price after discount:"+(price- (price * discount * 0.01 ))+"<h1>");
        printWriter.println("<html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
