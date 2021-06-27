import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void creditCardMaskTest() {
        assertEquals("############5616", CreditCard_Mask.maskify("4556364607935616"));
        assertEquals("#######5616",      CreditCard_Mask.maskify(     "64607935616"));
        assertEquals("1",                CreditCard_Mask.maskify(               "1"));
        assertEquals("",                 CreditCard_Mask.maskify(                ""));
        assertEquals("##ippy",                                    CreditCard_Mask.maskify("Skippy")                                  );
        assertEquals("####################################man!",  CreditCard_Mask.maskify("Nananananananananananananananana Batman!"));
    }
    @Test
    public void highestAndLowestTest(){
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("5 1", HighestAndLowest.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", HighestAndLowest.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", HighestAndLowest.highAndLow("1 9 3 4 -5"));
        assertNotEquals("4 -5", HighestAndLowest.highAndLow("1 9 3 4 -5"));

    }
}