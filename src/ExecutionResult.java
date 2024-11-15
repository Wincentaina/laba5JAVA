class ExecutionResult {
    private String actualOutput;
    private boolean isPassed;

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