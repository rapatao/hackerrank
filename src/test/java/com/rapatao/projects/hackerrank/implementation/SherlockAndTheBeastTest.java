package com.rapatao.projects.hackerrank.implementation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class SherlockAndTheBeastTest {

    private SherlockAndTheBeast mock = Mockito.mock(SherlockAndTheBeast.class);

    @Before
    public void setUp() {
        Mockito.when(mock.nextInt()).thenReturn(4).thenReturn(1).thenReturn(3).thenReturn(5).thenReturn(11);
        Mockito.doCallRealMethod().when(mock).execute(null);
        Mockito.doCallRealMethod().when(mock).generate(Mockito.any(Integer.class));
        Mockito.doCallRealMethod().when(mock).generate(Mockito.any(String[].class), Mockito.any(Integer.class));
        Mockito.doCallRealMethod().when(mock).validate(Mockito.any(String[].class));

    }

    @Test
    public void test() {
        mock.execute(null);
    }

}