package view;

import model.Member;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

public class KaupView {
    public static void main() {
        UtilService util = UtilServiceImpl.getInstance();
        Member person = Member.builder()
                            .height(util.createRandomDouble(150,200))
                            .weight(util.createRandomDouble(30,100))
                            .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBmi(person);
        String bodyMass = kaup.createBodyMass(bmi);

        System.out.printf("=========== BMI 계산기 ===========\n" +
                "BMI : %s\n" +
                "체지방 : %s\n" +
                "============================",
                bmi,bodyMass);

    }
}
