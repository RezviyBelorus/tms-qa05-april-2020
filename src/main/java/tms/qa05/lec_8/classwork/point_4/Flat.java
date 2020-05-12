package tms.qa05.lec_8.classwork.point_4;

import java.util.Objects;

public class Flat {
    private Integer number;
    private Integer window;
    private Double square;

    public Flat(Integer number, Integer window, Double square) {
        this.number = number;
        this.window = window;
        this.square = square;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Flat flat = (Flat) o;
        return Objects.equals(number, flat.number)
            && Objects.equals(window, flat.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            number,
            window);
    }

    @Override
    public String toString() {
        return "Flat{" +
            "number=" + number +
            ", window=" + window +
            ", square=" + square +
            '}';
    }
}
