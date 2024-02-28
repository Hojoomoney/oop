package service;

import model.MemberDto;

import java.util.List;


public interface MemberService {
    String join(MemberDto member);
    List<MemberDto> getUserList();
    String countUsers();
    String addUsers();
    String findUser(String username);
    String login(MemberDto member);

    String findUsersByName(String name);

    String changePassword(String username, String password);

    String delete(String username, String password);

    String findUsersByJob(String next);
}
