package service;

import model.Subject;

public interface GradeService {
    int getTotalScore(Subject subjects);
    double findAverage(int totalScore);
}
