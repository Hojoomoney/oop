package controller;

import model.Member;
import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.*;

public class MemberController {
    MemberService memberService;
    public MemberController(){
        this.memberService = MemberServiceImpl.getInstance();
    }

    public String join(Scanner sc){
        System.out.println("ID, 비번, 비번확인, 이름, 주민번호, 전화번호, 주소, 직업을 순서대로 입력하세요.");
        String msg = memberService.join(Member.builder()
                                        .username(sc.next())
                                        .password(sc.next())
                                        .confirmPassword(sc.next())
                                        .name(sc.next())
                                        .regNumber(sc.next())
                                        .phoneNumber(sc.next())
                                        .address(sc.next())
                                        .job(sc.next())
                                        .build());
        return msg;
    }
    public String login(Scanner scan){
        System.out.println("아이디와 비밀번호를 입력하세요.");
        String msg = memberService.login(Member.builder()
                                        .username(scan.next())
                                        .password(scan.next())
                                        .build());
        return msg;
    }
    public String addUsers(){
        String msg = MemberServiceImpl.getInstance().addUsers();
        return msg;
    }
    public Member findUser(Scanner scan){
        System.out.println("검색할 아이디를 입력하세요");
        return memberService.findUser(scan.next());
    }
    public List<Member> getUserList(){
        return memberService.getUserList();
    }
    public String countUsers(){
        return memberService.countUsers();
    }

    public String findUsersByName(Scanner sc) {
        return memberService.findUsersByName(sc.next());
    }

    public String changePassword(Scanner sc) {
        System.out.println("현재 아이디와 변경할 비밀번호를 입력해주세요.");
        String msg = memberService.changePassword(Member.builder()
                                                    .username(sc.next())
                                                    .password(sc.next())
                                                    .build());
        return msg;
    }

    public String delete(Scanner sc) {
        System.out.println("탈퇴하실 회원정보의 아이디와 비밀번호를 입력해주세요.");
        String msg = memberService.delete(Member.builder()
                                                .username(sc.next())
                                                .password(sc.next())
                                                .build());
        return msg;
    }

    public String findUsersByJob(Scanner sc) {
        String msg = memberService.findUsersByJob(sc.next());
        return msg;
    }
}
