package builder;

import model.MemberDto;

public class MemberBuilder {
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

    public MemberBuilder username(String username){
        this.username = username;
        return this;
    }
    public MemberBuilder password(String password){
        this.password = password;
        return this;
    }
    public MemberBuilder confirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
        return this;
    }
    public MemberBuilder name(String name){
        this.name = name;
        return this;
    }
    public MemberBuilder regNumber(String regNumber){
        this.regNumber = regNumber;
        return this;
    }
    public MemberBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public MemberBuilder address(String address){
        this.address = address;
        return this;
    }
    public MemberBuilder job(String job){
        this.job = job;
        return this;
    }
    public MemberBuilder height(double height){
        this.height = height;
        return this;
    }
    public MemberBuilder weight(double weight){
        this.weight = weight;
        return this;
    }
    public MemberDto build(){
        return new MemberDto(username,password,confirmPassword,name,
                            regNumber,phoneNumber,address,job,
                            height,weight);
    }
}
