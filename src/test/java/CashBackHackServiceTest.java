import org.junit.Test;

import static org.junit.Assert.*;

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