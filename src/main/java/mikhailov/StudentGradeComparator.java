package mikhailov;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Math.round(o2.getAverageGrade()) - Math.round(o1.getAverageGrade());
    }
}
