
class Human {

    private int age;
    private String name;

    public Human() {
        this.age = 24;
        this.name = "nimal";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
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

}

public class encapsulation {

    public static void main(String args[]) {

        Human human1 = new Human(20, "kamal");
        Human human2 = new Human(20, "saman");
        Human human3 = new Human();
        // human1.setAge(20);
        // human1.setName("kamal");

        // System.out.println(human1.age);

        System.out.println(human1.getAge());
        System.out.println(human1.getName());

        System.out.println(human2.getAge());
        System.out.println(human2.getName());

        System.out.println(human3.getAge());
        System.out.println(human3.getName());
    }
}
