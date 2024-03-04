package service;

import model.Member;

public interface KaupService {
    String createBmi(Member member);
    String createBodyMass(String bmi);
}
