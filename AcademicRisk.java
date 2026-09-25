package com.teachtrack;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "academic_risks")
public class AcademicRisk {

    @Id
    private String id;

    private String studentId;
    private String studentName;
    private String rollNumber;
    private String branch;
    private int year;
    private String division;

    private double averagePercentage;
    private int totalTests;

    private String riskLevel;

    public AcademicRisk() {
    }

    public String getId() {
        return id;
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

    public double getAveragePercentage() {
        return averagePercentage;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setAveragePercentage(double averagePercentage) {
        this.averagePercentage = averagePercentage;
    }

    public void setTotalTests(int totalTests) {
        this.totalTests = totalTests;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}