import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest(){
        Assertions.assertTrue(3>2);
    }
    void firstTest_1(){
        Assertions.assertTrue(4>2);
    }
    void firstTest_2(){
        Assertions.assertTrue(2>=2);
    }
}
