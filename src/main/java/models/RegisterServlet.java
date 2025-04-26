package models;

import models.Student;
import utils.RegistrationQueue;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static RegistrationQueue registrationQueue = new RegistrationQueue();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        Student student = new Student(id, name, email, new Date());
        registrationQueue.addStudent(student);

        response.sendRedirect("dashboard.jsp");
    }
}
