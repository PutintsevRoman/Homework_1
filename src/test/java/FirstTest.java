import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest(){
        Assertions.assertTrue(5>2);
    }
    void firstTest_1(){
        Assertions.assertTrue(4+8>2);
    }
    void firstTest_2(){
        Assertions.assertTrue(2+7-3>=2);
    }
}
