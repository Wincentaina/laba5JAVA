class Task {
    private final String description;
    private final TestSuite testSuite;

    public Task(String description, TestSuite testSuite) {
        this.description = description;
        this.testSuite = testSuite;
    }

    public String getDescription() {
        return this.description; // Используем this
    }

    public TestSuite getTestSuite() {
        return this.testSuite; // Используем this
    }
}