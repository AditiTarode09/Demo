package controller;

import lombok.Builder;
import model.User;
import service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateUser")
public class UpdateUser extends HttpServlet {
        UserService userService = new UserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int phone = Integer.parseInt(req.getParameter("phone"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = User.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .username(username)
                .password(password)
                .build();

        userService.updateUser(user);


//                .id(Integer.parseInt(req.getParameter("user_id")))
//                .name(req.getParameter("name"))
//                .email(req.getParameter("email"))
//                .phone(Integer.parseInt(req.getParameter("phone")))
//                .username(req.getParameter("username"))
//                .password(req.getParameter("password"))
//                .build();


//        int id = Integer.parseInt(req.getParameter("user_id"));
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        int phone = Integer.parseInt(req.getParameter("phone"));
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");


//        User user = new User();
//        user.setUser_id(id);
//        user.setName(name);
//        user.setEmail(email);
//        user.setPhone(phone);
//        user.setUsername(username);
//        user.setPassword(password);

//        userService.updateUser(user);
    }
}
