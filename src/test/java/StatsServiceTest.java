import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    private static int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private static StatsService statsService = new StatsService();

    @Test
    public void testSumArray() {
        assertEquals(statsService.sumArray(arr), 180);
    }

    @Test
    public void testAverageArray() {
        assertEquals(statsService.averageArray(arr), 15);
    }

    @Test
    public void testMaxAmountInArray() {
        assertEquals(statsService.maxArray(arr), 8);
    }

    @Test
    public void testMinAmountInArray() {
        assertEquals(statsService.minArray(arr), 9);
    }

    @Test
    public void testLessThanAverageArray() {
        assertEquals(statsService.amountBelowAverageArray(arr), 5);
    }

    @Test
    public void testMoreThanAverageArray() {
        assertEquals(statsService.amountAboveAverageArray(arr), 5);
    }
}