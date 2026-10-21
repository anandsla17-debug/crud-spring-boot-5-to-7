package crudpackage.crudapi.model;

import jakarta.persistence.*;


@Entity
@Table(name="admin table")
public class Adminmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serialno;

    private String adminid;
    private String adminname;
    private String adminpassword;
public Adminmodel(){

}

    public Adminmodel(String adminid, String adminname, String adminpassword) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.adminpassword = adminpassword;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }


}
