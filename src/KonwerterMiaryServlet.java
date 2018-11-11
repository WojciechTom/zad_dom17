import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KonwerterMiaryServlet", value="/konwerterMiary")
public class KonwerterMiaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WynikMiary miary = Konwerter.przeliczMiar(request.getParameter("metry"), request.getParameter("centymetry"),request.getParameter("milimetry"));


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if(miary == null){
            writer.println("Proszę wpisać jedną wartość miar" + "<br>" + "<br>");
        } else {
            writer.println("Podana Wartość w przeliczeniu na" + "<br>" + "<br>");
            writer.println("metry: " + miary.getMetry() + "<br>");
            writer.println("centymetry: " + miary.getCentymetry() + "<br>");
            writer.println("milimetry: " + miary.getMilimetry() + "<br>");
        }
    }
}
