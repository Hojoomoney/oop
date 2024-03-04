package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, Member> users;
    List<Member> memberList;

    private AuthServiceImpl(){
        this.users = new HashMap<>();
        this.memberList = new ArrayList<>();
    }
    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비번, 비번확인, 이름, 주민번호, 전화번호, 주소, 직업을 순서대로 입력하세요.");
        Member member = Member.builder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .regNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            users.put(username,
                    Member.builder()
                            .username(username)
                            .password("1")
                            .confirmPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        return null;
    }

    @Override
    public Member findUsers(String username) {
        Member member = Member.builder().build();
        return member;
    }

    @Override
    public Map<String, Member> getUserMap() {
        users.forEach((k,v) -> {
            System.out.println("{" + k + "," + v + "}.");
        });
        return users;
    }

    @Override
    public String count() {
        return users.size() + "";

    }


}
