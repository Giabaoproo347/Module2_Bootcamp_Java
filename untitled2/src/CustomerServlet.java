import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customers = new ArrayList<>();
        customers.add(new Customers("Bao",18f,"Tam Duong"));
        customers.add(new Customers("Hoang",17f,"Tam Duong"));
        customers.add(new Customers("Bao",16f,"Tam Duong"));
        customers.add(new Customers("Bao",16f,"Tam Duong"));
        customers.add(new Customers("Bao",16f,"Tam Duong"));

        request.setAttribute("customers",customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customers.jsp");
        requestDispatcher.forward(request,response);
    }
}
