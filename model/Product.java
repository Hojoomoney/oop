package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Product {
    private int id;
    private int pno;
    private String name;
    private String company;
    private int price;
    @Builder(builderMethodName = "builder")
    public Product(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

}
