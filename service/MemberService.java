package service;

import model.MemberDto;

import java.util.List;


public interface MemberService {
    String join(MemberDto member);
    List<MemberDto> getUserList();
    String countUsers();
    String addUsers();
    MemberDto findUser(String username);
    String login(MemberDto member);

    String findUsersByName(String name);

    String changePassword(MemberDto member);

    String delete(MemberDto member);

    String findUsersByJob(String next);
}
