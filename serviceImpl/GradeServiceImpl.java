package serviceImpl;

import model.SubjectDto;
import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeService getInstance(){
        return instance;
    }
    @Override
    public int getTotalScore(SubjectDto subjects) {
        return subjects.getKoreanScore() +
                subjects.getEnglishScore() +
                subjects.getMathScore();
    }

    @Override
    public double findAverage(int totalScore) {
        return totalScore/3.0;
    }
}
