package crudpackage.crudapi.dao;



public class CourseDAO {
    private int studentid;


    private String sname;

    private  String  courseduration;

    private String coursename;

    private String coursetime;

    private  int days;

    private long phoneno;

    public CourseDAO(String sname, String courseduration, String coursename, String coursetime, int days, long phoneno) {
        this.sname = sname;
        this.courseduration = courseduration;
        this.coursename = coursename;
        this.coursetime = coursetime;
        this.days = days;
        this.phoneno = phoneno;
    }

public CourseDAO(){

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
