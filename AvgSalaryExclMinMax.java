/**
 * @author Marlon Bair - 4/30/23
 * 
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 * 
 * Return the average salary of employees excluding the minimum and maximum salary. 
 * (Answers within 10-5 of the actual answer will be accepted.)
 * 
 */

public class AvgSalaryExclMinMax {

    // Performs only one iteration of salary list for O(n) time complexity
    public double average(int[] salary) {

        int min, max, sum;
        min = max = sum = salary[0];

        for(int i = 1; i < salary.length; i++) {

            if(salary[i] < min) { min = salary[i]; }

            else if(salary[i] > max) { max = salary[i]; }

            sum += salary[i];
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}
