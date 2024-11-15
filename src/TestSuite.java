import java.util.ArrayList;
import java.util.List;

class TestSuite {
    private static int totalTestSuitesCreated = 0; // Статическое поле
    private final List<TestCase> tests;

    public TestSuite(List<TestCase> tests) {
        this.tests = new ArrayList<>(tests);
        totalTestSuitesCreated++;
    }

    public List<TestCase> getTests() {
        return tests;
    }

    public int getTestCount() {
        return tests.size();
    }

    public static int getTotalTestSuitesCreated() {
        return totalTestSuitesCreated;
    }
}