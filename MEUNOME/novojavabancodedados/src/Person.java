public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Oi, meu nome é " + name + " e eu tenho " + age + " anos.");
    }
}