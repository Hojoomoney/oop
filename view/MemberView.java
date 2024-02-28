package view;

import controller.MemberController;
import java.util.Scanner;

public class MemberView {
    public static void main(Scanner sc) {
        MemberController ctrl = new MemberController();
        System.out.println(ctrl.addUsers());
        while(true){
            System.out.println("[메뉴] 0-종료\n" +
                    " 1-회원가입\n" +
                    " 2-로그인\n" +
                    " 3-ID검색\n" +
                    " 4-비번변경\n" +
                    " 5-탈퇴\n" +
                    " 6-회원목록\n" +
                    " 7-이름검색\n" +
                    " 8-직업검색\n" +
                    " 9-회원수");
            switch (sc.next()){
                case "0" :
                    System.out.println("종료");
                    return;
                case "1" :
                    System.out.println(ctrl.join(sc));
                    break;
                case "2" :
                    System.out.println(ctrl.login(sc));
                    break;
                case "3" :
                    System.out.println(ctrl.findUser(sc));
                    break;
                case "4" :
                    System.out.println(ctrl.changePassword(sc));
                    break;
                case "5" :
                    System.out.println(ctrl.delete(sc));
                    break;
                case "6" :
                    ctrl.getUserList();
                    break;
                case "7" :
                    System.out.println(ctrl.findUsersByName(sc));
                    break;
                case "8" :
                    System.out.println(ctrl.findUsersByJob(sc));
                case "9" :
                    System.out.println(ctrl.countUsers());
                    break;
            }

        }
    }
}
