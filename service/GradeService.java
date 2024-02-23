package service;

import model.SubjectDto;

public interface GradeService {
    int getTotalScore(SubjectDto subjects);
    double findAverage(int totalScore);
}
