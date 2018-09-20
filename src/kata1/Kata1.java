package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        Calendar date =  new GregorianCalendar(1998, 10, 23);
        
        Person person = new Person("Federico", date);
        System.out.println(person.getName() + " tiene: " + person.getAge() + " años");
    }
    
}
