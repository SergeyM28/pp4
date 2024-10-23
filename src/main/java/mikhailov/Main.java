package mikhailov;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Сгенерируем список студентов при помощи StudentFactory
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.generateList(10);
        System.out.println("ArrayList: \n" + studentFactory.getStudents());

        //Работа с ListIterator
        ListIterator<Student> studentListIterator = studentFactory.getStudents().listIterator();
        System.out.println("\nНиже должен появиться список имен, а потом он же, но наоборот");
        while(studentListIterator.hasNext()){
            System.out.printf(studentListIterator.next().getName() + " ");
        }
        System.out.println();
        while (studentListIterator.hasPrevious()){
            System.out.printf(studentListIterator.previous().getName() + " ");
        }

        System.out.println("\n");
        //Работа с TreeSet
        Set<Student> studentsTreeSet = new TreeSet<>(studentFactory.getStudents());
        System.out.println("TreeSet: \n" + studentsTreeSet);

        Set<Student> studentsNameTreeSet = new TreeSet<>(new StudentNameComparator());
        studentsNameTreeSet.addAll(studentFactory.getStudents());
        System.out.println("TreeSet. Comparator - name: \n" + studentsNameTreeSet);

        Set<Student> studentsTripleCompareTreeSet = new TreeSet<>(new StudentAgeComparator().thenComparing(
                new StudentGradeComparator().thenComparing(new StudentNameComparator())));
        studentsTripleCompareTreeSet.addAll(studentFactory.getStudents());
        System.out.println("Comparing age -> grade -> name TreeSet: \n" + studentsTripleCompareTreeSet);

        //Работа с TreeMap
        TreeMap<Student, Integer> studentMap = new TreeMap<>(new StudentAgeComparator());

        for (Student student : studentFactory.getStudents()){
            studentMap.put(student, new Random().nextInt(0, 100));
        }

        System.out.println("\nMap должна быть отсортирована по возрасту: \n" + studentMap);
    }
}