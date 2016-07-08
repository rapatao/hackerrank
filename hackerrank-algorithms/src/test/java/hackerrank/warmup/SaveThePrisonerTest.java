package hackerrank.warmup;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 08/07/2016
 */
public class SaveThePrisonerTest {

    private SaveThePrisoner saveThePrisoner = Mockito.spy(new SaveThePrisoner());

    @Test
    public void testCase1() {
        Mockito.doReturn(1).doReturn(5).doReturn(2).doReturn(1).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq(2));
    }

    @Test
    public void testCase2() {
        Mockito.doReturn(1).doReturn(5).doReturn(2).doReturn(2).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq(3));
    }


    @Test
    public void testCase3() {
        Mockito.doReturn(1).doReturn(5).doReturn(10).doReturn(1).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq(5));
    }

    @Test
    public void testCase4() {
        Mockito.doReturn(1).doReturn(5).doReturn(9).doReturn(1).when(saveThePrisoner).nextInt();
        saveThePrisoner.execute();
        final InOrder inOrder = Mockito.inOrder(saveThePrisoner);
        inOrder.verify(saveThePrisoner).print(Mockito.eq(4));
    }

    /*
     * 1 2 3 4 5
     * x x x x x
     * x x x x x
     */

}