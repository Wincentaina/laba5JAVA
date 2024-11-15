public class TestCase {
    private final String input;    // Входные данные для теста
    private final String expected; // Ожидаемый результат

    // Конструктор
    public TestCase(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    public String getInput() {
        return input;
    }

    public String getExpected() {
        return expected;
    }
}