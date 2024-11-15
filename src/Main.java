import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ExecutionResult runTestCase(UserSolution solution, TestCase test) {
        ExecutionResult result = new ExecutionResult();
        result.setActualOutput(test.getInput()); // Симуляция выполнения решения
        result.setIsPassed(result.getActualOutput().equals(test.getExpected()));
        return result;
    }

    public static Submission checkSolution(UserSolution solution, Task task) {
        Submission submission = new Submission(solution, task.getTestSuite().getTestCount());

        int totalPassed = 0;
        for (int i = 0; i < task.getTestSuite().getTestCount(); i++) {
            ExecutionResult result = runTestCase(solution, task.getTestSuite().getTests().get(i));
            submission.getResults().set(i, result);
            if (result.getIsPassed()) {
                totalPassed++;
            }
        }

        submission.setTotalPassed(totalPassed);
        return submission;
    }

    public static void main(String[] args) {
        try {
            TestCase test1 = new TestCase("input1", "input1");
            TestCase test2 = new TestCase("input2", "expected2");

            List<TestCase> tests = new ArrayList<>();
            tests.add(test1);
            tests.add(test2);

            TestSuite suite = new TestSuite(tests);

            Task task = new Task("Example Task", suite);
            UserSolution solution = new UserSolution("user_solution_code");

            Submission submission = checkSolution(solution, task);

            System.out.println("Total tests passed: " + submission.getTotalPassed() + " out of " + suite.getTestCount());
            for (int i = 0; i < suite.getTestCount(); i++) {
                System.out.println("Test " + (i + 1) + ": " + (submission.getResults().get(i).getIsPassed() ? "Passed" : "Failed"));
            }

            System.out.println("Total Test Suites Created: " + TestSuite.getTotalTestSuitesCreated());

            // Исключение для проверки работы try-catch
            if (submission.getTotalPassed() < suite.getTestCount()) {
                throw new IllegalArgumentException("Not all tests passed");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}