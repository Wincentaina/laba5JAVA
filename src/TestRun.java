import java.util.ArrayList;
import java.util.List;

public class TestRun {
    private final TestSuite suite;               // Набор тестов
    private final List<ExecutionResult> results; // Список результатов для каждого теста

    // Конструктор
    public TestRun(TestSuite suite) {
        this.suite = suite;
        this.results = new ArrayList<>(suite.getTestCount());
        for (int i = 0; i < suite.getTestCount(); i++) {
            results.add(new ExecutionResult()); // Инициализация списка результатов
        }
    }

    public List<ExecutionResult> getResults() {
        return results;
    }

    public TestSuite getSuite() {
        return suite;
    }
}
