package service;

import model.MemberDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();
    String addUsers();
    MemberDto findUsers(String username);
    Map<String, MemberDto> getUserMap();
    String count();
}
