import java.util.Scanner;

public class Main {
    private static Double calculateGrossYearSalary(Double hoursWorkedPerWeek, Double hourlyRate) {
        Double result;
        Double totalYearlyHours;
        Scanner keyboard = new Scanner(System.in);

        while(hoursWorkedPerWeek <= 0) {
            System.out.print("Please enter a positive number for hours worked per week:\t");
            hoursWorkedPerWeek = keyboard.nextDouble();
        }

        while(hourlyRate <= 0) {
            System.out.print("Please enter a positive number for hourly rate:\t");
            hourlyRate = keyboard.nextDouble();
        }

        totalYearlyHours = hoursWorkedPerWeek * 52;
        result = totalYearlyHours * hourlyRate;
        keyboard.close();
        return result;
    }    
    public static void main(String[] args) {
        Double hoursWorkedPerWeek;
        Double hourlyRate;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter hours worked per week:\t");
        hoursWorkedPerWeek = keyboard.nextDouble();
        System.out.print("Enter hourly rate:\t");
        hourlyRate = keyboard.nextDouble();

        Double yearlySalary = calculateGrossYearSalary(hoursWorkedPerWeek, hourlyRate);
        System.out.print("Total gross salary for the year is " + yearlySalary);
        
        keyboard.close();
    }
}
