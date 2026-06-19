package com.nagasai.Springboot.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagasai.Springboot.models.User;

@Service 
public class UserService {
    private List<User> allUsers;
    private int curId = 3;
    public UserService(){
        allUsers = new ArrayList<>();
        allUsers.add(new User(1,"John","/images/john.png","Male"));
        allUsers.add(new User(2,"Jane","/images/jane.png","Female"));

    }
    public List<User> getAllUsers(){
        return allUsers;
    }
    public User getUserById(int id){
        for(User user: allUsers){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
    public User addUser(User user){
        user.setId(curId);
        curId++;
        allUsers.add(user);
        return user;
    }

   

}
