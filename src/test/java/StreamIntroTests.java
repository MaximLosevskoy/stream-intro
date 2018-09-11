import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Started by ML on 9/11/2018.
 */
public class StreamIntroTests {
    List<String> input = asList("This", "is", "java", "8", "stream", "API", "examples");

    @Test
    public void testStreamFilterIntro() {
        List<String> filteredList = null;
        /*Your code here*/
        assertEquals(asList("is", "8"), filteredList);
    }

    @Test
    public void testStreamMapIntro() {
        List<Integer> mappedList = null;
        /*Your code here*/
        assertEquals(asList(4, 2, 4, 1, 5, 3, 8), mappedList);
    }

    @Test
    public void testStreamFilterMapIntro() {
        List<Integer> mappedAndFilteredList = null;
        /*Your code here*/
        assertEquals(asList(16, 16, 25, 64), mappedAndFilteredList);
    }
}
