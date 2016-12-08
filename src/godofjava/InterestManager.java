package godofjava;

/**
 * Created by KimBangHyun on 2016. 12. 8..
 */
public class InterestManager {

    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager() ;

        long amount = 1000000 ;

        for (int day=1;day<=365;day++) {
            //
            System.out.print("Day " + day + " " + (day % 10));
            System.out.print("caculateAmount: " + interestManager.calculateAmount(day,amount));

            if (day== 1 || (day % 10) == 0) {
                System.out.println(" " + "caculateAmount: " + interestManager.calculateAmount(day, amount));
            } else System.out.println(" ");
        }

    }

    public double getInterestRate(int day) {
        double interestRate = 0.0;

        if (day >= 1 && day <= 90) interestRate = 0.5 / 100;
        else if (day <= 180) interestRate = 1.0 / 100;
        else if (day <= 364) interestRate = 2.0 / 100;
        else if (day >= 365) interestRate = 5.6 / 100;

        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        double caculuateAmount = getInterestRate(day) * amount + amount ;

        return caculuateAmount;
    }
}