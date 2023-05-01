class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0, count = salary.length - 2;
        for (int s: salary) {
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
            sum += s;
        }
        return (sum - min - max) / count;
    }
}