package entity;

public class Person {
    boolean sex;
    int age;
    String name;

    public Person(boolean sex, int age, String name) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout(){
        System.out.println("fuck...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
