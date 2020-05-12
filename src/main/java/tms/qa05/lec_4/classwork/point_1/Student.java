package tms.qa05.lec_4.classwork.point_1;

import java.util.Objects;

public class Student {
    /*
    private
    default
    protected
    public
     */
    public static Integer year;
    private String name;
    private Integer age;
    private Integer group;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Nonstatic block");
    }

    public Student(String name) {
        this(name, null);
    }

    public Student(String name, Integer age) {
        this(name, age, null);
    }

    public Student(String name, Integer age, Integer group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object cheburashka) {
        if (this == cheburashka) {
            return true;
        }

        if (cheburashka == null || this.getClass() != cheburashka.getClass()) {
            return false;
        }

        Student student = (Student) cheburashka;

        if (!this.name.equals(student.name)) {
            return false;
        }

        if (!this.age.equals(student.age)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            age,
            group);
    }

    public String toString() {
        return "name = " + this.name + "; " + "age = " + this.age + "; " + "group = " + this.group + "; " + "year = " + year;
    }
}
