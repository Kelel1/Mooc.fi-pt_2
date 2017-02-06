package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        this.age = age;
        this.name = name;

        if(this.name == null || this.name.length() > 40 || this.name.equals("")) {
            throw new IllegalArgumentException("Name not valid");
        }
        if(this.age < 0 || this.age > 120) {
            throw new IllegalArgumentException("Age outside normal range");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}
