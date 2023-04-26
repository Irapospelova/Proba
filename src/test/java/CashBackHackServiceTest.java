
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackServiceTest {
    @Test

    public void shouldCalcSumRemain() {
        CashBackHackService service = new CashBackHackService();

        int amount;
        int actual = service.remain(200);
        int expected = 800;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldShowNull() {
        CashBackHackService service = new CashBackHackService();

        int amount;
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

}