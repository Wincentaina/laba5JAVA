import java.util.ArrayList;
import java.util.List;

class Submission {
    private final UserSolution solution;
    private final List<ExecutionResult> results;
    private int totalPassed;

    public Submission(UserSolution solution, int testCount) {
        this.solution = solution;
        this.results = new ArrayList<>(testCount);
        for (int i = 0; i < testCount; i++) {
            results.add(new ExecutionResult());
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
        return this.solution; // Используем this
    }
}