package tms.qa05.lec_5.classwork.point_2;

public class Siamskiy extends AbstractCat {
    private String name;

    public Siamskiy(int age, String name) {
        super(age);
        System.out.println("constructor: Siamskiy cat");
        this.name = name;
    }

    @Override
    public void color() {
        System.out.println("Siamskiy's color");
        super.color();
    }

    @Override
    protected void eat() {
        System.out.println("Siamskiy is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
