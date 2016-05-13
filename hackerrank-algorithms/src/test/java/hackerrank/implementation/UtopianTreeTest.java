package hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class UtopianTreeTest {

    private UtopianTree mock = Mockito.spy(new UtopianTree());

    @Before
    public void setUp() {
        Mockito.doReturn(3).doReturn(0).doReturn(1).doReturn(4).when(mock).nextInt();
    }

    @Test
    public void test() {
        mock.execute(null);
    }

}