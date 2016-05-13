package hackerrank.dynamicprogramming;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class FibonacciModifiedTest {

    private FibonacciModified mock = Mockito.spy(new FibonacciModified());

    @Before
    public void setUp() {
        Mockito.doReturn(0).doReturn(1).doReturn(5).when(mock).nextInt();
    }

    @Test
    public void test() {
        mock.execute();
    }

}