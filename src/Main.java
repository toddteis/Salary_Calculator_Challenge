import java.util.Scanner;

public class Main {
    private static Double calculateGrossYearSalary(Double hoursWorkedPerWeek, Double hourlyRate, Double vacationDaysTaken) {
        Double result;
        Double totalYearlyHours;
        Double vacationHoursTaken;
        
        Scanner keyboard = new Scanner(System.in);

        while(hoursWorkedPerWeek <= 0) {
            System.out.print("Please enter a positive number for hours worked per week:\t");
            hoursWorkedPerWeek = keyboard.nextDouble();
        }

        while(hourlyRate <= 0) {
            System.out.print("Please enter a positive number for hourly rate:\t");
            hourlyRate = keyboard.nextDouble();
        }

        while(vacationDaysTaken < 0) {
            System.out.print("Please enter a positive number or 0 for vacation days taken:\t");
            vacationDaysTaken = keyboard.nextDouble();
        }


        totalYearlyHours = hoursWorkedPerWeek * 52;
        vacationHoursTaken = vacationDaysTaken * 8;
        result = (totalYearlyHours - vacationHoursTaken) * hourlyRate;
        keyboard.close();
        return result;
    }    
    public static void main(String[] args) {
        Double hoursWorkedPerWeek;
        Double hourlyRate;
        Double vacationDaysTaken;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter hours worked per week:\t");
        hoursWorkedPerWeek = keyboard.nextDouble();
        System.out.print("Enter hourly rate:\t");
        hourlyRate = keyboard.nextDouble();
        System.out.print("Enter vacation days taken:\t");
        vacationDaysTaken = keyboard.nextDouble();

        Double yearlySalary = calculateGrossYearSalary(hoursWorkedPerWeek, hourlyRate, vacationDaysTaken);
        System.out.print("Total gross salary for the year is " + yearlySalary);
        
        keyboard.close();
    }
}
