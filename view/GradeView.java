package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        System.out.println("다음은 한 학생의 과목 점수이다. ");

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        MemberDto student = new MemberBuilder()
                        .name(sc.next())
                        .build();
        SubjectDto subjects = new SubjectBuilder()
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