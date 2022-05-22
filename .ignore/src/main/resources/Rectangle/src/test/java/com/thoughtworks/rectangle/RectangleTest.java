package com.thoughtworks.rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {

        Rectangle area = new Rectangle(19.73 , 17.34 );

        double result = area.area();

        assertEquals(19.73 * 17.34, result, 0.0000001);
    }
    
    
    
}