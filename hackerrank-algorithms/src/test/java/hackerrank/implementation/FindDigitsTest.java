package hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class FindDigitsTest {

    private FindDigits mock = Mockito.spy(new FindDigits());

    @Before
    public void setUp() {
        Mockito.doReturn(2).doReturn(12).doReturn(1012).when(mock).nextInt();
    }

    @Test
    public void test() {
        mock.execute(null);
    }

}