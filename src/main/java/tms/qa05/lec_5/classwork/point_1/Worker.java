package tms.qa05.lec_5.classwork.point_1;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
            "name='" + name + '\'' +
            '}';
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Andrei");

        System.out.println(worker);

        Worker egor = worker;
        egor.setName("Egor");
        System.out.println(egor);
        System.out.println("==new andrei==");
        System.out.println(worker);

    }
}
