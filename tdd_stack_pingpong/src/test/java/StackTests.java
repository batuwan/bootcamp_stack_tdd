import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;


import static org.junit.Assert.*;

public class StackTests {
    private Stack1 stack;

    @Test
    public void push_WhenOneValueGiven_ShouldReturnValue(){

        //Given
        Stack1 stack = new Stack1();

        //When
        String result = stack.push("Ankara");

        //Then

        assertThat(result).isEqualTo("Ankara");

    }

    @Test
    public void push_WhenGivenValueIsNull_ShouldThrowException(){

        //Given
        Stack1 stack = new Stack1();

        //When
        Throwable throwable = catchThrowable(() -> stack.push(null));

        //Then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class).hasMessage("Input must not be null!");




    }

    @Test
    public void pop_WhenStackIsEmpty_ShouldThrowException(){

        //Given
        Stack1 stack = new Stack1();

        //When
        Throwable throwable = catchThrowable(() -> stack.pop());

        //Then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class).hasMessage("Stack is empty!");
    }
    @Test
    public void pop_WhenInNormalConditions_ShouldRemoveAndReturnLastElement(){

        //Given
        Stack1 stack = new Stack1();
        List<String> list = new ArrayList<String>();
        list.add("Eskişehir");
        list.add("Ankara");
        stack.setStack(list);
        //When
        String result = stack.pop();

        //Then
        assertEquals(result, "Ankara");

    }
    @Test
    public void peek_WhenStackIsEmpty_ShouldThrowException(){
        //Given
        Stack1 stack = new Stack1();

        //When
        Throwable throwable = catchThrowable(() -> stack.peek());

        //Then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class).hasMessage("Stack is empty!");
    }

    @Test
    public void pop_WhenInNormalConditions_ShouldReturnLastElement(){

        //Given
        Stack1 stack = new Stack1();
        List<String> list = new ArrayList<String>();
        list.add("Eskişehir");
        list.add("Ankara");
        stack.setStack(list);
        //When
        String result = stack.peek();

        //Then
        assertEquals(result, "Ankara");

    }
}
