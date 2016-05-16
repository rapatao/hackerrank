package hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 16/05/2016
 */
public class ServiceLaneTest {

    ServiceLane mock = Mockito.spy(new ServiceLane());

    @Before
    public void setUp() {



    }

    @Test
    public void testCase1() {
        Mockito.doReturn(8)
               .doReturn(5)
               .doReturn(2)
               .doReturn(3)
               .doReturn(1)
               .doReturn(2)
               .doReturn(3)
               .doReturn(2)
               .doReturn(3)
               .doReturn(3)
               .doReturn(0)
               .doReturn(3)
               .doReturn(4)
               .doReturn(6)
               .doReturn(6)
               .doReturn(7)
               .doReturn(3)
               .doReturn(5)
               .doReturn(0)
               .doReturn(7)
               .when(mock)
               .nextInt();


        mock.execute();
        final InOrder inOrder = Mockito.inOrder(mock);
        inOrder.verify(mock).print(Mockito.eq(1));
        inOrder.verify(mock).print(Mockito.eq(2));
        inOrder.verify(mock).print(Mockito.eq(3));
        inOrder.verify(mock).print(Mockito.eq(2));
        inOrder.verify(mock).print(Mockito.eq(1));
    }

    @Test
    public void testCase2() {
        Mockito.doReturn(5)
               .doReturn(5)
               .doReturn(1)
               .doReturn(2)
               .doReturn(2)
               .doReturn(2)
               .doReturn(1)
               .doReturn(2)
               .doReturn(3)
               .doReturn(1)
               .doReturn(4)
               .doReturn(2)
               .doReturn(4)
               .doReturn(2)
               .doReturn(4)
               .doReturn(2)
               .doReturn(3)
               .when(mock)
               .nextInt();


        mock.execute();
        final InOrder inOrder = Mockito.inOrder(mock);
        inOrder.verify(mock).print(Mockito.eq(2));
        inOrder.verify(mock).print(Mockito.eq(1));
        inOrder.verify(mock).print(Mockito.eq(1));
        inOrder.verify(mock).print(Mockito.eq(1));
        inOrder.verify(mock).print(Mockito.eq(2));
    }

}