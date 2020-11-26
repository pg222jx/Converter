package com.company.Model;

import org.junit.Test;
import com.company.View.Input;
import static org.junit.Assert.assertTrue;

public class ConverterFactoryTest {

    @Test
    public void getConverter_shouldCreateInstanceOfMConverter() {
        Converter c = ConverterFactory.getConverter(Input.Meter, 1.0);
        assertTrue(c instanceof MConverter);
    }

}
