import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void verify(){
        Cat cat = new Cat();
        cat.animal();
        Cow cow = new Cow();
        cow.animal();
    }


}
