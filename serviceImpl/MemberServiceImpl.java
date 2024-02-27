package serviceImpl;

import model.MemberDto;
import service.MemberService;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    @Override
    public String join(MemberDto member) {
        return null;
    }

    @Override
    public String login(MemberDto member) {
        return null;
    }

    @Override
    public MemberDto findUserById(String username) {
        return null;
    }

    @Override
    public void updatePassword(MemberDto member) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<MemberDto> getUserList() {
        return null;
    }

    @Override
    public List<MemberDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<MemberDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }
}
