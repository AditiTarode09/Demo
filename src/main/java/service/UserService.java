package service;

import dao.Userdao;
import model.User;

import java.util.List;

public class UserService {
    Userdao userdao = new Userdao();

    public void userService(User user) {
        userdao.addUser(user);
    }
    public void deleteUser(int id){
        userdao.deleteUser(id);
    }

    public void updateUser(User user){
        userdao.updateUser(user);
    }

    public List<User> getAllUser(){
       return userdao.getAllUser();
    }
}
