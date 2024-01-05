class Human{

    private int age = 20;
    private String name = "kamal";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class encapsulation {
    
    public static void main(String args[]){

        Human human1 = new Human();
        // human1.age = 20;
        // human1.name = "kamal";

        // System.out.println(human1.age);

        System.out.println(human1.getAge());
        System.out.println(human1.getName());
    }
}
