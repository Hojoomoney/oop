package service;

import model.MemberDto;

import java.util.List;


public interface MemberService {
    String join(MemberDto member);
    String login(MemberDto member);
    MemberDto findUserById(String username);
    void updatePassword(MemberDto member);
    String deleteUser(String username);
    List<MemberDto> getUserList();
    List<MemberDto> findUsersByName(String name);
    List<MemberDto> findUsersByJob(String job);
    int countUsers();
}
