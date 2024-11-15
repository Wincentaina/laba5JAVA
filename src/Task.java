public class Task {
    private final String description; // Описание задачи
    private final TestSuite testSuite; // Набор тестов для задачи

    // Конструктор
    public Task(String description, TestSuite testSuite) {
        this.description = description;
        this.testSuite = testSuite;
    }

    public String getDescription() {
        return description;
    }

    public TestSuite getTestSuite() {
        return testSuite;
    }
}
