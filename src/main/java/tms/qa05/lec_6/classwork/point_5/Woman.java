package tms.qa05.lec_6.classwork.point_5;

import tms.qa05.lec_6.classwork.point_4.Man;

public class Woman implements Man {
    private String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
