package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberController {
    private Map<String, MemberDto> users;

    public MemberController() {
        this.users = new HashMap<>();
    }

    public void addUsers(){
        AuthServiceImpl.getInstance().addUsers();
    }
    public void findUser(String username){
        System.out.println(users.get(username).toString());
    }
    public void getUserList(){
        List<MemberDto> userList = new ArrayList<>();
        users.forEach((k,v) ->{
            userList.add(v);
        });
        userList.forEach(i ->{
            System.out.println(i);
        });
    }
}
