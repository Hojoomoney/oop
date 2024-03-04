package view;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 한 학생의 과목 점수이다. ");

        UtilService util = UtilServiceImpl.getInstance();
        System.out.println("이름을 입력하세요 : ");
        Member student = Member.builder()
                        .name(sc.next())
                        .build();
        Subject subjects =  Subject.builder()
                        .koreanScore(util.createRandomInteger(0,100))
                        .englishScore(util.createRandomInteger(0,100))
                        .mathScore(util.createRandomInteger(0,100))
                        .build();

        GradeService grade = GradeServiceImpl.getInstance();
        System.out.println("다음은 한 학생의 과목 점수이다.");
        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);
        System.out.println("평균 점수를 구하시오");

        System.out.printf(" ============= 성적표 ==============\n" +
                "이름 : %s \n" +
                "국어 : %s \n" +
                "영어 : %s \n" +
                "수학 : %s \n" +
                "총합 : %s \n" +
                "평균 : %s \n",
                student.getName(),
                subjects.getKoreanScore(),
                subjects.getEnglishScore(),
                subjects.getMathScore(),
                totalScore,
                String.format("%.1f",average));
    }
}
