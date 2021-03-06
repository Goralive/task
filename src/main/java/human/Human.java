package human;

import java.io.Serializable;

public class Human implements Comparable<Human>, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private int age;
    private double weight;
    private int height;

    public Human(String name, String surname, int age, double weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String getInformation() {
        return "The name is: " + name + " " + surname
                + "\nAge is: " + age
                + "\nWeight and height: " + weight + " " + height;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(final Human other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result = nullSafeStringComparator(this.surname, other.surname);
        if (result != 0) {
            return result;
        }
        return nullSafeStringComparator(this.name, other.name);
    }


    private int nullSafeStringComparator(final String one, final String two) {
        if (one == null ^ two == null) {
            return (one == null) ? -1 : 1;
        }

        if(one == null && two == null){
            return 0;
        }
        return one.compareToIgnoreCase(two);
    }
}
