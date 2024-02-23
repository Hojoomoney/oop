package view;

import builder.MemberBuilder;
import model.MemberDto;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID, 비번, 비번확인, 이름, 주민번호, 전화번호, 주소, 직업을 순서대로 입력하세요.");
        MemberDto member = new MemberBuilder()
                        .username(sc.next())
                        .password(sc.next())
                        .confirmPassword(sc.next())
                        .name(sc.next())
                        .regNumber(sc.next())
                        .phoneNumber(sc.next())
                        .address(sc.next())
                        .job(sc.next())
                        .build();

        System.out.println(member);
    }
}
