package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {

        Rectangle area = new Rectangle(2.65 , 2.0 );

        double result = area.area();

        assertThat(result, is(closeTo(5.3)));
    }
    
    double closeTo(double d){
       return  d;
    }
    
}