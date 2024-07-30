package testFile;

import org.example.Person;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

import static org.testng.AssertJUnit.assertEquals;


public class CustomerTest {
     Person person  = new Person("Emre", "emre@emre.com", 50000.0);
     Person person1 = new Person("veli","veli@veli.com",90000.0);

    @BeforeClass
    public void beforeClass(){

        //person = Person.builder().name("veli").email("veli@veli.com").wage(90000.0).build();
        //person1 = Person.builder().name("emre").email("emre@emre.com").wage(50000.0).build();
//        person.name = "Emre";
//        person.email = "emre@emre.com";
//        person.wage = 50000;
//
//        person1.name = "veli";
//        person1.email = "veli@veli.com";
//        person1.wage = 90000;
    }
    @Test
    public void testCustomerName() {
        assertEquals(person.getName(), "Emre");
        assertEquals(person1.getName(), "veli");
    }
    @Test
    public void testCustomerWage (){
        assertEquals(person.maasHesapla(28), 53000.0);
        assertEquals(person1.maasHesapla(25), 90000.0);
    }

}
