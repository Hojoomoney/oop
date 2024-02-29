package serviceImpl;

import builder.MemberBuilder;
import model.MemberDto;
import service.MemberService;
import service.UtilService;

import java.util.*;

public class MemberServiceImpl implements MemberService {
    private static MemberService instance = new MemberServiceImpl();
    Map<String, MemberDto> members;

    public MemberServiceImpl() {
        this.members = new HashMap<>();
    }
    public static MemberService getInstance(){
        return instance;
    }

    @Override
    public String join(MemberDto member) {
        members.put(member.getUsername(),member);
        return "회원가입 성공";
    }

    @Override
    public List<MemberDto> getUserList() {
        return new ArrayList<>(members.values());
    }
    @Override
    public String countUsers() {
        return "회원 수 : " + members.size();
    }

    @Override
    public String addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            members.put(username,
                    new MemberBuilder()
                            .username(username)
                            .password("1")
                            .confirmPassword("1")
                            .name(util.createRandomName())
                            .job(util.createRandomJob())
                            .build());
        }
        return "더미데이터 삽입 성공";
    }

    @Override
    public MemberDto findUser(String username) {
        return members.get(username);
    }

    @Override
    public String login(MemberDto input) {
        MemberDto member = members.get(input.getUsername());
        if(member == null){
            return "회원정보가 없습니다.";
        } else if(member.getPassword().equals(input.getPassword())){
            return "로그인 성공";
        } else {
            return "패스워드가 일치하지 않습니다.";
        }
    }

    @Override
    public String findUsersByName(String name) {
        List<MemberDto> userList = new ArrayList<>();
        members.forEach((k,v) -> {
            if(v.getName().equals(name)){
                userList.add(v);
            }
        });
        if(userList.isEmpty()){
            return "입력하신 이름과 일치하는 회원이 없습니다.";
        } else {
            userList.forEach(i -> {
                System.out.println(i);
            });
            return "이름과 일치하는 회원 정보 출력";
        }
    }

    @Override
    public String changePassword(MemberDto member) {
        if(members.get(member.getUsername()) == null){
            return "존재하지 않는 회원입니다.";
        } else {
            members.get(member.getUsername()).setPassword(member.getPassword());
            return "비밀번호 변경 완료";
        }
    }

    @Override
    public String delete(MemberDto member) {
        if(members.get(member.getUsername()) == null){
            return "존재하지 않는 회원입니다.";
        } else if(members.get(member.getUsername()).getPassword().equals(member.getPassword())){
            members.remove(member.getUsername());
            return "회원 탈퇴 완료";
        } else {
            return "비밀번호가 일치 하지 않습니다.";
        }
    }

    @Override
    public String findUsersByJob(String job) {
        List<MemberDto> userList = new ArrayList<>();
        members.forEach((k,v) -> {
            if(v.getJob().equals(job)){
                userList.add(v);
            }
        });
        if(userList.isEmpty()){
            return "입력하신 직업과 일치하는 회원이 없습니다.";
        } else {
            userList.forEach(i -> {
                System.out.println(i);
            });
            return "직업과 일치하는 회원 정보 출력";
        }
    }
}
