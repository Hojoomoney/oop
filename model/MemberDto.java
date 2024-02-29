package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDto {
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

}
