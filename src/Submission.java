import java.util.ArrayList;
import java.util.List;

public class Submission {
    private final UserSolution solution;        // Решение пользователя
    private final List<ExecutionResult> results; // Результаты выполнения тестов
    private int totalPassed;                    // Общее количество пройденных тестов

    // Конструктор
    public Submission(UserSolution solution, int testCount) {
        this.solution = solution;
        this.results = new ArrayList<>(testCount);
        for (int i = 0; i < testCount; i++) {
            results.add(new ExecutionResult()); // Инициализация результатов
        }
        this.totalPassed = 0;
    }

    public void setTotalPassed(int totalPassed) {
        this.totalPassed = totalPassed;
    }

    public int getTotalPassed() {
        return totalPassed;
    }

    public List<ExecutionResult> getResults() {
        return results;
    }

    public UserSolution getSolution() {
        return solution;
    }
}
