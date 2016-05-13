package hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 13/05/2016
 */
public class SherlockAndSquaresTest {

    SherlockAndSquares mock = Mockito.spy(new SherlockAndSquares());

    @Before
    public void setUp() {
        Mockito.doReturn(2).doReturn(3).doReturn(9).doReturn(17).doReturn(24).when(mock).nextInt();
    }

    @Test
    public void test() {
        mock.execute();

        final InOrder inOrder = Mockito.inOrder(mock);
        inOrder.verify(mock).print(Mockito.eq(2));
        inOrder.verify(mock).print(Mockito.eq(0));
    }

}