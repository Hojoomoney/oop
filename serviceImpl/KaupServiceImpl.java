package serviceImpl;

import model.MemberDto;
import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){}
    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBmi(MemberDto member) {
        double height = member.getHeight();
        double weight = member.getWeight();
        double bmi = weight / (height/100*height/100);
        return String.format("%.1f",bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        if(bmiDouble < 18.5){
            return "저체중";
        } else if(bmiDouble < 23){
            return "정상";
        } else if(bmiDouble < 25) {
            return "과체중";
        } else {
            return "비만";
        }
    }
}
