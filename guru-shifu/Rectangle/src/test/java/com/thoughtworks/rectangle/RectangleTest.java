package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {

        Rectangle rectangle = new Rectangle(2.65 , 2.0 );

        double result = rectangle.area();

        assertThat(result, is(closeTo(5.3,5.4)));

        double perimeter_result = rectangle.perimeter();

        assertThat(perimeter_result,is(closeTo(9.3,9.3)));
    }
    
    double closeTo(double d1, double d2){
       return  d1;
    }


    
}