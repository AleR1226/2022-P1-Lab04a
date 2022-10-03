// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student 100 point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths  = numYears * 12;
        double precent    = (annualRate / 100) / 12;
        double numerator = precent * Math.pow(1 + precent,numMonths);
        double denominator = (Math.pow(1 + precent, numMonths) - 1);
        double MonthPay = (((numerator / denominator) * principal) * 100);
        MonthPay = Math.round(MonthPay);
        MonthPay /= 100;
        double Tpay = (MonthPay * numMonths)* 100;
        Tpay = Math.round(Tpay);
        Tpay /= 100;
        double Tintr = (Tpay - principal)* 100;
        Tintr = Math.round(Tintr);
        Tintr /= 100;
        System.out.println("Principal:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of Years:    " + numYears);
        System.out.println("Monthly Payment:    $" + MonthPay);
        System.out.println("Total Payments:     $" + Tpay);
        System.out.println("Total Interest:     $" + Tintr);
    }
}

