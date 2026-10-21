package crudpackage.crudapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentcoursetable")
public class Coursemodel {
    @Id //=>primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement mysql
    private int studentid;

    @Column(name = "student_name")
    private String sname;
    @Column(name="sduration")
    private  String  courseduration;
    @Column(name = "scoursename")
    private String coursename;
    @Column(name="scousetime")
    private String coursetime;
    @Column(name="noofdays")
    private  int days;
    @Column(name = "sphoneno")
    private long phoneno;

    public Coursemodel() {
    }

    public Coursemodel(String sname, String courseduration, String coursename, String coursetime, int days, long phoneno) {
        this.sname = sname;
        this.courseduration = courseduration;
        this.coursename = coursename;
        this.coursetime = coursetime;
        this.days = days;
        this.phoneno = phoneno;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(String courseduration) {
        this.courseduration = courseduration;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
}
