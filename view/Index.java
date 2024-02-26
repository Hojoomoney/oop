package view;
// x- extends 약자
// 화면을 할때 사용
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame{

    Index(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("홈페이지");
        this.setLayout(new GridLayout(3, 3, 10, 10));
        JButton joinBtn = new JButton("회원가입");
        joinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(joinBtn);

        JButton accountBtn = new JButton("통장생성");
        accountBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(accountBtn);

        JButton listBtn = new JButton("목록보기");
        listBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(listBtn);

        setSize(600,600);
        setLocation(100,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Index();

    }
}
