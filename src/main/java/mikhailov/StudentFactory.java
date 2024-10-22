package mikhailov;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentFactory {
    private List<Student> students = new ArrayList<>();
    private List<String> names = Arrays.asList("Abraham", "Addison", "Adrian", "Archibald", "Archie", "Arlo", "Arthur",
            "Arthur", "Austen", "Barnabe", "Bartholomew", "Bertram", "Cardew", "Chad", "Chance", "Daniel", "Darry",
            "David", "Earl", "Ebenezer", "Edgar", "Floyd", "Franklin", "Frederick", "George", "Gerard", "Gilbert",
            "Henry", "Hervey", "Hudson", "Jack", "Jaime", "Julian", "Lawton", "Lester", "Malcolm", "Marcus", "Mark",
            "Nate", "Nathan", "Neil", "Oliver", "Oscar", "Osric", "Patrick", "Paul", "Peleg", "Raymond", "Reginald",
            "Simon", "Stephen", "Swaine", "Thomas", "Tobias", "Travis", "Victor", "Vincent",
            "Wayne", "Wilfred", "William", "Zadoc");

    private List<String> surnames = Arrays.asList("Adams", "Allen", "Black", "Brown", "Dean", "Ellis", "Ford", "George",
            "Green", "Hughes", "Jackson", "James", "Johnson", "King", "Little", "Miller", "Scott", "Smith");

    private Random random = new Random();
    public void generateList (int numberOfStudents) {
        for (int i = 0; i <numberOfStudents; i++){
            students.add(new Student(names.get(random.nextInt(names.size())) + " " + surnames.get(random.nextInt(surnames.size())),
                    random.nextInt(17, 24),
                    random.nextFloat(2.0f, 5.0f)));
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void clearList(){
        this.students.clear();
    }
}
