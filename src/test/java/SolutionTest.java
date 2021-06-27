import org.junit.Test;
import static org.junit.Assert.assertEquals;
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
}