package tms.qa05.lec_5.classwork.point_2;

public abstract class AbstractCat implements BlackCat, WhiteCat {
    private int age;

    public AbstractCat(int age) {
        System.out.println("constructor: Abstract cat");
        this.age = age;
    }

    protected void eat() {
        System.out.println("Abstract cat is eating");
    }

    @Override
    public void color() {
        System.out.println("I'm with mixed color");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
