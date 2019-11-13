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
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Hoàng Văn A","2019-09-08","Vĩnh Phúc","https://anhdephd.com/wp-content/uploads/2019/06/tron-bo-anh-gai-xinh-han-quoc-dep-lat-ngat-23.jpg"));
        customers.add(new Customer("Nguyễn Văn B","2018-03-08","Hà Nội","https://anhdephd.com/wp-content/uploads/2019/06/tron-bo-anh-gai-xinh-han-quoc-dep-lat-ngat-23.jpg"));
        customers.add(new Customer("Trần Văn C","2012-03-04","Bắc Giang","https://anhdephd.com/wp-content/uploads/2019/06/tron-bo-anh-gai-xinh-han-quoc-dep-lat-ngat-23.jpg"));
        customers.add(new Customer("Đăng Văn D","2010-09-05","Hòa Bình","https://anhdephd.com/wp-content/uploads/2019/06/tron-bo-anh-gai-xinh-han-quoc-dep-lat-ngat-23.jpg"));


        request.setAttribute("customers",customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customers.jsp");
        requestDispatcher.forward(request,response);
    }
}
