package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;

    @Builder(builderMethodName = "builder")
    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }



}
