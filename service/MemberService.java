package service;

import model.Member;

import java.util.List;


public interface MemberService {
    String join(Member member);
    List<?> getUserList();
    String countUsers();
    String addUsers();
    Member findUser(String username);
    String login(Member member);

    String findUsersByName(String name);

    String changePassword(Member member);

    String delete(Member member);

    String findUsersByJob(String next);
}
