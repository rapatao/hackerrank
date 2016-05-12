package com.rapatao.projects.hackerrank.sorting;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class IntroToTutorialChallengesTest {

    private IntroToTutorialChallenges mock = Mockito.spy(new IntroToTutorialChallenges());

    @Before
    public void setUp() {
        Mockito.doReturn(4)
               .doReturn(4)
               .doReturn(1)
               .doReturn(4)
               .doReturn(5)
               .doReturn(7)
               .doReturn(9)
               .doReturn(12)
               .when(mock)
               .nextInt();
    }

    @Test
    public void test() {
        mock.execute(null);
    }

}