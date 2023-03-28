//package com.assessment.employee.Entities;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Combined {
//    @Id
//    private long id;
//    private String name;
//
//    private String email;
//    private int phone_number;
//    private String job_title;
//    private double salary;
//    private double productivity_score;
//    private double quality_of_work_score;
//    private double attendance_score;
//    private String skillName;
//    private String proficiencyLevel;
//
//    private String certificationName;
//    private float rating;
//    private int totalWorkingDays;
//
//    @OneToMany
//    @JoinColumn(name = "employee_id")
//    private Employee employee;
//
//    public Combined(String name, String email, int phone_number, String job_title, double salary, double productivity_score, double quality_of_work_score, double attendance_score, String skillName, String proficiencyLevel, String certificationName, float rating, int totalWorkingDays, Employee employee) {
//        this.name = name;
//        this.email = email;
//        this.phone_number = phone_number;
//        this.job_title = job_title;
//        this.salary = salary;
//        this.productivity_score = productivity_score;
//        this.quality_of_work_score = quality_of_work_score;
//        this.attendance_score = attendance_score;
//        this.skillName = skillName;
//        this.proficiencyLevel = proficiencyLevel;
//        this.certificationName = certificationName;
//        this.rating = rating;
//        this.totalWorkingDays = totalWorkingDays;
//        this.employee = employee;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(int phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public String getJob_title() {
//        return job_title;
//    }
//
//    public void setJob_title(String job_title) {
//        this.job_title = job_title;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public double getProductivity_score() {
//        return productivity_score;
//    }
//
//    public void setProductivity_score(double productivity_score) {
//        this.productivity_score = productivity_score;
//    }
//
//    public double getQuality_of_work_score() {
//        return quality_of_work_score;
//    }
//
//    public void setQuality_of_work_score(double quality_of_work_score) {
//        this.quality_of_work_score = quality_of_work_score;
//    }
//
//    public double getAttendance_score() {
//        return attendance_score;
//    }
//
//    public void setAttendance_score(double attendance_score) {
//        this.attendance_score = attendance_score;
//    }
//
//    public String getSkillName() {
//        return skillName;
//    }
//
//    public void setSkillName(String skillName) {
//        this.skillName = skillName;
//    }
//
//    public String getProficiencyLevel() {
//        return proficiencyLevel;
//    }
//
//    public void setProficiencyLevel(String proficiencyLevel) {
//        this.proficiencyLevel = proficiencyLevel;
//    }
//
//    public String getCertificationName() {
//        return certificationName;
//    }
//
//    public void setCertificationName(String certificationName) {
//        this.certificationName = certificationName;
//    }
//
//    public float getRating() {
//        return rating;
//    }
//
//    public void setRating(float rating) {
//        this.rating = rating;
//    }
//
//    public int getTotalWorkingDays() {
//        return totalWorkingDays;
//    }
//
//    public void setTotalWorkingDays(int totalWorkingDays) {
//        this.totalWorkingDays = totalWorkingDays;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//}
