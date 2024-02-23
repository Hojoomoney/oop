package service;

import model.MemberDto;

public interface KaupService {
    String createBmi(MemberDto member);
    String createBodyMass(String bmi);
}
