package model;

public class SubjectDto {
    private int id;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public SubjectDto(int koreanScore, int englishScore, int mathScore) {
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "koreanScore=" + koreanScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
