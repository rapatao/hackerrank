package hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class AngryProfessorTest {

    private AngryProfessor angryProfessor = Mockito.mock(AngryProfessor.class);

    @Before
    public void setUp() {
        Mockito.when(angryProfessor.readInt())
               .thenReturn(2)
               .thenReturn(4)
               .thenReturn(3)
               .thenReturn(-1)
               .thenReturn(-3)
               .thenReturn(4)
               .thenReturn(2)
               .thenReturn(4)
               .thenReturn(2)
               .thenReturn(0)
               .thenReturn(-1)
               .thenReturn(2)
               .thenReturn(1);
        Mockito.doCallRealMethod().when(angryProfessor).execute(Mockito.any(String[].class));
    }

    @Test
    public void testExecute() {
        angryProfessor.execute(null);
    }

}