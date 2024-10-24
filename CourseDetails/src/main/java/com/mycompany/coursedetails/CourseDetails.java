/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursedetails;

/**
 *
 * @author SChang2026
 * 
 */

//Changing points total to mean GPA weight in class with grade

public class CourseDetails {

    public static void main(String[] args) {
        
        //full constructor/first class
        Course one = new Course ("AP Calculus BC","Calc BC","Mr. Dahms",4);
        //partial constructor/second class
        Course two = new Course ("AP U.S. History");
        two.setCourseCode("APUSH");
        two.setCourseInstructor("Mr. White");
        two.setPointsTotal(5);
        
        // third class
        Course three = new Course ("AP Language and Composition","AP Lang", "Mr. Werstler",5);
        
        // fourth class
        Course four = new Course ("AP Environmental Science","APES", "Ms. DasGupta",4);
        
        // fifth class
        Course five = new Course ("AP Computer Science A","AP CSA", "Mr. Nelson",5);
        
        // sixth class
        Course six = new Course ("College Psychology 101 & 114","Psych 101", "Mr. Caro",5);
        
        //print classes information to console
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        
    }
}

class Course {
    
    //constructor code
    
    private String courseName, courseCode, courseInstructor;
    private int pointsTotal;

    public Course(String courseName, String courseCode, String courseInstructor, int pointsTotal) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseInstructor = courseInstructor;
        this.pointsTotal = pointsTotal;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    //getters and setters for the course variables
    
    
    //variable one
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    //variable two
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //variable three
    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
    
    //variable four
    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
    
    //string to print in console    
    public String toString() {
        return "Course Name: " + courseName + "\n" + "Course Code: " + courseCode + "\n" + "Course Intructor: " + courseInstructor + "\n" + "GPA Total: " + pointsTotal + "\n";
    }
}

//Instructions

//Write a class called Course that represents a course offered to students. 
//It should contain instance data that represents the course title (e.g. Computer Science), course code (e,g, AP CS A), pointsTotal, and course Instructor’s name. 
//Define one Course constructor to accept and initialize all instance data. 
//Define a second constructor which accepts course name only.
//Include Accessor (getter) and Mutator (setter) methods for all instance data. 
//Include a toString method that returns a multi-line description of the course. 
//Create a driver class called CourseDetails whose main method instantiates and updates several Course objects (at least 3).
//At least one course should be created using the full object constructor, and one that uses the name only creator (but has the rest of it's values set by the setter and retrieved by getter methods).
//The main method should then print out each course from the toString.