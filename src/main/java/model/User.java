package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    private int phone;


    public User(int id) {
    }
}
