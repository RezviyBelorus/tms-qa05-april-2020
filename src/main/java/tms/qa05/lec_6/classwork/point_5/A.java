package tms.qa05.lec_6.classwork.point_5;

public interface A extends B, C {
    String getCity();
}

interface B {
    int getAge();
}

interface C {
    String getName();
}

class Cat implements A {
    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getCity() {
        return null;
    }
}
