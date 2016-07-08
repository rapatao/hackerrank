package hackerrank.implementation;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 08/07/2016
 */
public class KangarooTest {

    private Kangaroo saveThePrisoner = Mockito.spy(new Kangaroo());

    @Test
    public void testCase1() {
        Mockito.doReturn(0).doReturn(3).doReturn(4).doReturn(2).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq("YES"));
    }

    @Test
    public void testCase2() {
        Mockito.doReturn(0).doReturn(2).doReturn(5).doReturn(3).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq("NO"));
    }

}