package testFile;

import org.example.Person;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CustomerDataProvider {

//mvn clean test -Dtest="CustomerDataProvider"
    @Test(groups = "unit", dataProvider = "person")
    public void testPerson (String name, String email, int day ,double wage,double toplammaas){
        Person person = new Person(name,email,wage);

        assertEquals(person.getName(), name );
        assertEquals(person.getEmail(), email );
        assertEquals(person.maasHesapla(day) , toplammaas);
    }

    @DataProvider(name = "person")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"cem", "cem@cem@gmail.com",25, 50000.0, 50000.0},
                {"ali", "ali@ali@gmail.com",29, 90000.0, 94000.0},
                {"emre", "emre@emre@gmail.com",28, 60000.0, 63000.0},
                {"mert", "mert@mert@gmail.com",30, 50000.0, 55000.0}
        };
    }

}
