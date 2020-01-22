import CalculatriceSimple.MathOutil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathOutilTest {

    @BeforeEach
    void init(){
        MathOutil mo = new MathOutil();
        assumeTrue(true);
        System.out.println("Before all");
    }


    @Test
    @DisplayName("All test")
    void ertAllTest(){
        MathOutil mo = new MathOutil();
        assertAll(() -> {
            assertEquals(4, mo.addition(3,1), "Message erreur de assert");
        }, () ->{
            assertEquals(12.56, mo.cercle(2));
        });
    }

    //@Disabled
    @Tag("math")
    @DisplayName("Addition test")
    @RepeatedTest(4)
    void test(){
        MathOutil mo = new MathOutil();
        int expected = 4;
        int actuel = mo.addition(3,1);
        assertEquals(expected, actuel, "Message erreur de assert");
    }

    @Tag("test")
    @Test
    @DisplayName("Cercle test")
    void testCercle(){
        MathOutil mo = new MathOutil();
        double expected = 12.56;
        double actual = mo.cercle(2);
        assertEquals(expected, actual);
        //assertThrows(ArithmeticException.class, ()->mo.cercle(2));
    }

    @Nested
    public class ArTest{
        @Test
        void testArr(){
            System.out.println("Test Nested");
        }
    }


}
