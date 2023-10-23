package sem3;

import java.util.List;

public class StudentGroupControler {
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();
    StreamService streamService = new StreamService();

    public void createStudentGroup(List<Student> studentList){
        studentGroupService.createGroup(studentList);
    }
    public Student createStudents(String firstname, String secondname, String lastname, int studentId, int srBall) {
        return studentGroupService.createStudent(firstname, secondname, lastname, studentId, srBall);
    }

    public List<Student> sortedStudentGroupBySrBall(){
        return studentGroupService.getSortedStudentGroupBySRBall();
    }
    public List<Student> sortedStudentGroupByFIO(){
        return studentGroupService.getSortedStudentGroupByFIO();
    }



    public void print(){
        studentGroupView.printStudentGroup(studentGroupService.getListStudent());
    }
    public void print(List<Student> list){
        studentGroupView.printStudentGroup(list);
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
