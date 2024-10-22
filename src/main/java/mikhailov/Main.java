package mikhailov;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.generateList(10);
        System.out.println("ArrayList: " + studentFactory.getStudents());

        Set<Student> studentsTreeSet = new TreeSet<>(studentFactory.getStudents());
        System.out.println("TreeSet: " + studentsTreeSet);

        Set<Student> studentsNameTreeSet = new TreeSet<>(new StudentNameComparator());
        studentsNameTreeSet.addAll(studentFactory.getStudents());
        System.out.println("TreeSet. Comparator - name: " + studentsNameTreeSet);

        Set<Student> studentsTripleCompareTreeSet = new TreeSet<>(new StudentAgeComparator().thenComparing(
                new StudentGradeComparator().thenComparing(new StudentNameComparator())));
        studentsTripleCompareTreeSet.addAll(studentFactory.getStudents());
        System.out.println("Comparing age -> grade -> name TreeSet: " + studentsTripleCompareTreeSet);

    }
}