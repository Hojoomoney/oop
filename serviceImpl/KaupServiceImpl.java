package serviceImpl;

import model.Member;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {
    Map<String, ?> kaupMap;
    List<?> kaupList;
    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){
        this.kaupList = new ArrayList<>();
        this.kaupMap = new HashMap<>();
    }
    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBmi(Member member) {
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
