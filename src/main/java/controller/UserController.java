package controller;

import model.Income;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Handler;

@WebServlet("/user")
public class UserController extends HttpServlet {
    UserService userServiceController = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int phone = Integer.parseInt(req.getParameter("phone"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = User.builder()

                .name(name)
                .email(email)
                .phone(phone)
                .username(username)
                .password(password)
                .build();

        userServiceController.userService(user);

    }


    void editIncome(Income income){

    }
    Income getIncomeById(int incomeId){
        return null;
    }
    List<Income> getAllIncomes(){
        return null;
    }
    List<Income> filterBasedOnRemark(String remark){
        return null;
    }
}
