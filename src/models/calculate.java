package models;

public class calculate {

    public static int payroll(int hoursWorked, int hourlyRate) {
        return hoursWorked * hourlyRate;
    }
    
    public static int overtime(int hoursWorked, int hourlyRate) {
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * hourlyRate * 2; // Overtime pay is double the hourly rate
        }
        return 0; // No overtime pay if hours worked is 40 or less
    }
    
}
