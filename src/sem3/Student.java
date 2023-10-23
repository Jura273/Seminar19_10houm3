package sem3;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String firstname;
    private String secondname;
    private String lastname;
    private int studentId;

    private int srBall;



    public Student(String firstname, String secondname, String lastname, int studentId, int srBall) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.srBall = srBall;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentId=" + studentId +
                ", srBall=" + srBall +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if(this.srBall == o.getSrBall())
            return 0;
        if(this.srBall > o.srBall)
            return 1;
        return - 1;
    }
}


