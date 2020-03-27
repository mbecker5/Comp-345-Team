import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestClassTest {

    @Test
    public void testHello(){
        assertEquals("Hello", TestClass.printHello());
    }


    @Test
    public void AnimalTests(){

        //assertEquals(1, animalList.getCount());
        Animal a1 = new Animal("Spot", "Canine");
        assertEquals("Spot", a1.getName());
        assertEquals("Canine", a1.getSpecies());

    }

    @Test
    public void AnimalDSTests() throws EmptyListException {
        //Constructor Test
        AnimalList al1 = new AnimalList();
        assertEquals(0,al1.getCount());

        //Get Count Test
        al1.addAnimal("Doodle", "Feline");
        assertEquals(1,al1.getCount());


        //Search List Tests
        assertEquals(0, al1.searchList("Doodle")); // first position in list
        assertEquals(-1, al1.searchList("Zipper")); //not in list
        al1.addAnimal("Spike", "Pantherophis guttatus");
        assertEquals(1, al1.searchList("Spike")); // first position in list

        //Remove Animal Tests
        al1.removeAnimal("Doodle"); //animal in list
        assertEquals(1,al1.getCount());
        assertThrows(IllegalArgumentException.class,()->al1.removeAnimal("Zipper") ); // Illegal Argument - Animal not in list
        al1.removeAnimal("Spike");
        assertThrows(EmptyListException.class,()->al1.removeAnimal("Zipper") ); //Empty List




    }
}
