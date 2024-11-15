public class ExecutionResult {
    private String actualOutput; // Фактический результат выполнения
    private boolean isPassed;    // Успешность прохождения теста

    // Конструктор по умолчанию
    public ExecutionResult() {
        this.isPassed = false;
    }

    public void setActualOutput(String actualOutput) {
        this.actualOutput = actualOutput;
    }

    public String getActualOutput() {
        return actualOutput;
    }

    public void setIsPassed(boolean isPassed) {
        this.isPassed = isPassed;
    }

    public boolean getIsPassed() {
        return isPassed;
    }
}
