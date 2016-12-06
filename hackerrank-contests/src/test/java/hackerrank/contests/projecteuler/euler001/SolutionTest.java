package hackerrank.contests.projecteuler.euler001;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 06/12/2016
 */
public class SolutionTest {

    private Solution mock = Mockito.spy(new Solution());

    @Test
    public void testCase001() {
        Mockito.doReturn("2").doReturn("10").doReturn("100").when(mock).next();
        mock.execute();
        final InOrder inOrder = Mockito.inOrder(mock);
        inOrder.verify(mock).print(Mockito.eq(23L));
        inOrder.verify(mock).print(Mockito.eq(2318L));
    }

    @Test
    public void test() {
        Solution.main(null);
    }

}