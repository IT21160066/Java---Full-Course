class Human {

    private int age;
    private String name;

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

}

public class encapsulation {

    public static void main(String args[]) {

        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("kamal");

        // System.out.println(human1.age);

        System.out.println(human1.getAge());
        System.out.println(human1.getName());
    }
}
