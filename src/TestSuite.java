import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private final List<TestCase> tests;    // Список тестов

    // Конструктор
    public TestSuite(List<TestCase> tests) {
        this.tests = new ArrayList<>(tests); // Создаем копию переданного списка для безопасности
    }

    public List<TestCase> getTests() {
        return tests;
    }

    public int getTestCount() {
        return tests.size();
    }
}
