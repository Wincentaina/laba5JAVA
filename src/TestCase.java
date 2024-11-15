import java.util.ArrayList;
import java.util.List;

class TestCase {
    private final String input;
    private final String expected;

    public TestCase(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    public String getInput() {
        return this.input; // Используем this
    }

    public String getExpected() {
        return this.expected; // Используем this
    }
}