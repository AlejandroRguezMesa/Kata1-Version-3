
package kata1version3;

import java.time.LocalDate;



/**
 *
 * @author Andres
 */
public class Kata1Version3 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1949, 9, 24);
        
        Person person = new Person("Blas",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}