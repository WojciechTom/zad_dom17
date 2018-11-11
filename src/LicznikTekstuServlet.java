import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LicznikTekstuServlet", value="/licznikTekstu")
public class LicznikTekstuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tekst = request.getParameter("pole");

        WynikTekst tab = LicznikTekstu.licz(tekst);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println(tekst + "<br>" + "<br>");
        writer.println("Ilość słów: " + tab.getLiczbaSlow() + "<br>");
        writer.println("Ilość znaków: " + tab.getLiczbaZnakow() + "<br>");
        writer.println("Ilość znaków (bez spacji): " + tab.getLiczbaZnakowBezSpacji() + "<br>");
        writer.println("Palindrom: " + tab.isCzyPal());


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
