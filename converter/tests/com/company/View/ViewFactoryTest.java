package com.company.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ViewFactoryTest {
    private ViewFactory sut;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getConsoleView_shouldReturnConsole() {
        AView AV = ViewFactory.getConsoleView("1");
        assertTrue(AV instanceof Console);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getConsoleView_shouldThrowIllegalArgumentExceptionIfNotInput1() {
        AView AV = ViewFactory.getConsoleView("2");
        assertTrue(AV instanceof Console);
    }

}