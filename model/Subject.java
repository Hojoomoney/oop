package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Subject {
    private int id;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    @Builder(builderMethodName = "builder")
    public Subject(int koreanScore, int englishScore, int mathScore) {
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

}
