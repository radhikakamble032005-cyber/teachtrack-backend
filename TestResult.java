package com.teachtrack;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test_results")
public class TestResult {

    @Id
    private String id;

    private String testId;
    private String studentId;

    // Student details
    private String studentName;
    private String rollNumber;
    private String branch;
    private int year;
    private String division;

    // Test details
    private String subject;
    private String unit;

    // Answers and result
    private List<Answer> answers;

    private int score;
    private int totalQuestions;
    private double percentage;

    // Topic-wise analysis
    private List<TopicAnalysis> topicAnalysis;

    // Learning gaps and recommended actions
    private List<String> learningGaps;
    private List<String> recommendedActions;

    private LocalDateTime submittedAt;

    public TestResult() {
    }

    public String getId() {
        return id;
    }

    public String getTestId() {
        return testId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public int getYear() {
        return year;
    }

    public String getDivision() {
        return division;
    }

    public String getSubject() {
        return subject;
    }

    public String getUnit() {
        return unit;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public double getPercentage() {
        return percentage;
    }

    public List<TopicAnalysis> getTopicAnalysis() {
        return topicAnalysis;
    }

    public List<String> getLearningGaps() {
        return learningGaps;
    }

    public List<String> getRecommendedActions() {
        return recommendedActions;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setTopicAnalysis(List<TopicAnalysis> topicAnalysis) {
        this.topicAnalysis = topicAnalysis;
    }

    public void setLearningGaps(List<String> learningGaps) {
        this.learningGaps = learningGaps;
    }

    public void setRecommendedActions(List<String> recommendedActions) {
        this.recommendedActions = recommendedActions;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public static class Answer {

        private String questionId;
        private String selectedOptionId;

        public Answer() {
        }

        public String getQuestionId() {
            return questionId;
        }

        public String getSelectedOptionId() {
            return selectedOptionId;
        }

        public void setQuestionId(String questionId) {
            this.questionId = questionId;
        }

        public void setSelectedOptionId(String selectedOptionId) {
            this.selectedOptionId = selectedOptionId;
        }
    }

    public static class TopicAnalysis {

        private String topic;
        private int totalQuestions;
        private int correctAnswers;
        private double percentage;
        private String status;

        public TopicAnalysis() {
        }

        public String getTopic() {
            return topic;
        }

        public int getTotalQuestions() {
            return totalQuestions;
        }

        public int getCorrectAnswers() {
            return correctAnswers;
        }

        public double getPercentage() {
            return percentage;
        }

        public String getStatus() {
            return status;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public void setTotalQuestions(int totalQuestions) {
            this.totalQuestions = totalQuestions;
        }

        public void setCorrectAnswers(int correctAnswers) {
            this.correctAnswers = correctAnswers;
        }

        public void setPercentage(double percentage) {
            this.percentage = percentage;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}