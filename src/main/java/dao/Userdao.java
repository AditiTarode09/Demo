package dao;
import model.Income;
import model.User;
import utils.DBUtils;

import javax.servlet.annotation.WebServlet;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Userdao {

    public void addUser(User user) {
        Connection connection = DBUtils.getConnection();

        try {
            String query = "insert into user"+ "(id,name,email,phone,username,password) values" + "(?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getPhone());
            preparedStatement.setString(5, user.getUsername());
            preparedStatement.setString(6, user.getPassword());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

       public void deleteUser (int id){
        Connection connection = DBUtils.getConnection();

           try {
               String query = "delete from user where id=?";
               PreparedStatement preparedStatement = connection.prepareStatement(query);
               preparedStatement.setInt(1,id);

               preparedStatement.executeUpdate();
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }

       public void updateUser(User user){
        Connection connection = DBUtils.getConnection();
        String query = "update user set name=?,email=?,phone=?,username=?,password=? where id=?";
           try {
               PreparedStatement preparedStatement = connection.prepareStatement(query);
//               preparedStatement.setInt(1,user.getId());
               preparedStatement.setString(1, user.getName());
               preparedStatement.setString(2,user.getEmail());
               preparedStatement.setInt(3, user.getPhone());
               preparedStatement.setString(4,user.getUsername());
               preparedStatement.setString(5, user.getPassword());
               preparedStatement.setInt(6,user.getId());

               preparedStatement.executeUpdate();
               System.out.println("Data updated successfully");
               connection.close();

           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
       public List<User> getAllUser(){
        List<User> userList = new ArrayList<User>();
           try {
               Connection connection = DBUtils.getConnection();
               String query = "select * from user";

               PreparedStatement preparedStatement=connection.prepareStatement(query);
               ResultSet resultSet=preparedStatement.executeQuery();

               while (resultSet.next()){
                  User user = User.builder()
                          .id(resultSet.getInt("id"))
                          .name(resultSet.getString("name"))
                          .email(resultSet.getString("email"))
                          .phone(resultSet.getInt("phone"))
                          .username(resultSet.getString("username"))
                          .build();

                  userList.add(user);
                   System.out.println("List of the User - ");
               }
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
        return userList;
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
