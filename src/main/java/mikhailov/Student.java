package mikhailov;

import java.text.DecimalFormat;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float averageGrade;

    public Student(String name, int age, float averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return name + " " + age +
                ", averageGrade = " + new DecimalFormat( "#.##" ).format(averageGrade);
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge();
    }
}
