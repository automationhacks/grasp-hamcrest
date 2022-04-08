import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BasicHamcrestMatchers {
    @Test
    public void testTwoStringsAreEqual() {
       assertThat("Foo", equalTo("Foo"));
    }

    @Test
    public void testTwoIntsAreNotEqual() {
        assertThat(1, not(equalTo(2)));
    }

    @Test
    public void testSubstringMatches() {
       assertThat("This is a long string", containsString("long"));
    }

    @Test
    public void testTwoObjectsAreNotEqual() {
       assertThat(new Foo("Hello"), not(equalTo(new Foo("Hello"))));
    }

    @Test
    public void testMultipleAssertionsForAnObject() {
        Foo foo = new Foo("hello");
        assertThat("hello", foo.getName(), equalTo("hello"));
    }
}
