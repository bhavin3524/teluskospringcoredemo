package com.required_annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private int studentId;
    private String studentName;
    private String courseName;
    private String studentHobby;

    public Student() {

    }

    public Student(int studentId, String studentName, String courseName, String studentHobby) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.studentHobby = studentHobby;
    }

    public int getStudentId() {
        return studentId;
    }

    @Value("${student.studentId}")
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }


//    @Required
//    @Value("Vatsal")
    @Value("${student.studentName}")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Value("${student.courseName}")
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    @Value("${student.studentHobby}")
    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", studentHobby='" + studentHobby + '\'' +
                '}';
    }
}
