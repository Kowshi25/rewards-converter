public class RewardValue {
    double cashValue=100;

    static double rate=0.0035;
    double milesValue=10000;


    public RewardValue(double cashValue){
        this.cashValue= cashValue;

    }
    public RewardValue(int milesValue){
        this.cashValue=(int)milesValue*rate;
    }


    public double getCashValue(){
        return cashValue;
    }



    public double getMilesValue(){
        return (int)(cashValue/rate);
    }
    public void convertMilesToCash(double milesValue){
        double cashValue=milesValue*rate;
        System.out.println(cashValue);
    } public void convertCashToMiles(double cashValue){
        double milesValue=cashValue/rate;
        System.out.println(milesValue);
    }
}

