package sem3;

import java.util.Comparator;

public class StudentComaporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getSecondname().compareTo(o2.getSecondname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstname().compareTo(o2.getFirstname());
            if (resultOfComparing == 0) {
                return o1.getLastname().compareTo(o2.getLastname());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
