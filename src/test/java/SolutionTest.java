import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findLongestChainTest1() {
        int[][] pairs = {
                {1, 2},
                {2, 3},
                {3, 4}
        };
        int output = 2;
        Assert.assertEquals(output, new Solution().findLongestChain(pairs));
    }

    @Test
    public void findLongestChainTest2() {
        int[][] pairs = {
                {1, 2},
                {7, 8},
                {4, 5}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().findLongestChain(pairs));
    }
}
