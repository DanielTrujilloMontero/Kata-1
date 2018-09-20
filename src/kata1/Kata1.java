package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person person = new Person("Federico", new Date(98,9,23));
        System.out.println(person.getName() + " tiene: " + person.getAge() + " años");
    }
    
}
