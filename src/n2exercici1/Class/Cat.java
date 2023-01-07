package n2exercici1.Class;

import n2exercici1.Annotations.SerializeToJson;

@SerializeToJson(path = "/Users/marinaroyoterol/GitHub/s107/src/n2exercici1/Class/ObjectFile.json")
public class Cat {

    private String name;
    private String color;
    private int age;

    public Cat(){}

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
