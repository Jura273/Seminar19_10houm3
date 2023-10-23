package sem3;
import sem3.Student;
import sem3.StudentComaporator;
import sem3.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void createGroup(List<Student> studentList) {
        studentGroup = new StudentGroup(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public  Student createStudent(String firstname, String secondname, String lastname, int studentId, int srBall){
        return new Student(firstname, secondname, lastname, studentId, srBall);
    }

    public List<Student> getSortedStudentGroupBySRBall(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getListStudent(){
        return studentGroup.getStudentList();
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComaporator());
        return studentList;
    }


}

