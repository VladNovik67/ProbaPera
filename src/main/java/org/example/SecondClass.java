package org.example;

public class SecondClass {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SecondClass{" +
                "id=" + id +
                '}';
    }
}
