import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/login")
public class Servletdemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,"noi com dientoshiba", "https://cdn.nguyenkimmall.com/images/detailed/297/10035245-noi-com-dien-supor-1-5l-cfxb40fc33vn-75-1.jpg"));
        list.add(new Product(2,"noi com dien pana", "https://cdn01.dienmaycholon.vn/filewebdmclnew/public//userupload/images/noi-com%204.jpg"));
        list.add(new Product(3,"noi com dien kangaro", "https://kingshop.vn/data/products/500/noi-com-dien-kim-cuong-nap-roi-12lr-dung-tich-12l-2.jpg"));
        list.add(new Product(4,"noi com dien yamaha", "https://cdn.nguyenkimmall.com/images/detailed/297/10035245-noi-com-dien-supor-1-5l-cfxb40fc33vn-75-1.jpg"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");

   if (username.equals("vinh") && password.equals("vinh")){
       RequestDispatcher dispatcher = request.getRequestDispatcher("home.html");
       dispatcher.forward(request,response);
   }else {
       RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
       dispatcher.forward(request,response);
   }
    }
}
