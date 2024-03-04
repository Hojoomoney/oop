package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();
    String addUsers();
    Member findUsers(String username);
    Map<String, Member> getUserMap();
    String count();
}
