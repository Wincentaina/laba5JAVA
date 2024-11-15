import java.util.ArrayList;
import java.util.List;

public class Main {

    // Метод для симуляции выполнения теста
    public static ExecutionResult runTestCase(UserSolution solution, TestCase test) {
        ExecutionResult result = new ExecutionResult();
        result.setActualOutput(test.getInput()); // Симуляция выполнения решения
        result.setIsPassed(result.getActualOutput().equals(test.getExpected()));
        return result;
    }

    // Метод для выполнения всех тестов
    public static TestRun runAllTests(UserSolution solution, TestSuite suite) {
        TestRun run = new TestRun(suite);

        for (int i = 0; i < suite.getTestCount(); i++) {
            ExecutionResult result = runTestCase(solution, suite.getTests().get(i));
            run.getResults().set(i, result);
        }

        return run;
    }

    // Метод для проверки решения пользователя
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
        TestCase test1 = new TestCase("input1", "input1");
        TestCase test2 = new TestCase("input2", "expected2");

        // Создаем список тестов и набор тестов
        List<TestCase> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);

        TestSuite suite = new TestSuite(tests);

        // Создание задачи
        Task task = new Task("Example Task", suite);

        // Решение пользователя
        UserSolution solution = new UserSolution("user_solution_code");

        // Запуск проверки решения
        Submission submission = checkSolution(solution, task);

        // Вывод результатов
        System.out.println("Total tests passed: " + submission.getTotalPassed() + " out of " + suite.getTestCount());
        for (int i = 0; i < suite.getTestCount(); i++) {
            System.out.println("Test " + (i + 1) + ": " + (submission.getResults().get(i).getIsPassed() ? "Passed" : "Failed"));
        }
    }
}
