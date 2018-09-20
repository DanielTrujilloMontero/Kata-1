package kata1;

import java.time.LocalDate;


public class Kata1 {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998, 10, 23);
        Person person = new Person("Federico", date);
        System.out.println(person.getName() + " tiene: " + person.getAge() + " años");
    }
    
}
