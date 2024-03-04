package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member {
    private String username;
    private String password;
    private String confirmPassword;
    private String name;
    private String regNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    @Builder(builderMethodName = "builder")
    public Member(String username, String password, String confirmPassword, String name, String regNumber, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.regNumber = regNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
