package controller;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getAllUser")
public class GetAllUser extends HttpServlet {
    UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        for (User user : userService.getAllUser()) {
            writer.println(user);
        }

//        writer.println(userService.getAllUser());





//        int userId = Integer.parseInt(req.getParameter("user_id"));
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        int phone = Integer.parseInt("phone");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");

//        User user = User.builder()
//                .id(Integer.parseInt(req.getParameter("user_id")))
//                .name(req.getParameter("name"))
//                .email(req.getParameter("email"))
//                .phone(Integer.parseInt(req.getParameter("phone")))
//                .username(req.getParameter("username"))
//                .password(req.getParameter("password"))
//                .build();

    }
}
