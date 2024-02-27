package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController{
    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login() {
        return auth.login();
    }

    public void addUsers() {
        auth.addUsers();
    }
    public void findUser(String username){
        auth.findUsers(username);
    }
    public void count(){
        System.out.println(auth.count());
    }
    public void getUserMap(){
        auth.getUserMap();
    }
}
