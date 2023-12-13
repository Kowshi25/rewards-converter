public class RewardValue {
    double cashValue=100;

    double rate=0.0034;
    double milesValue=10000;


    public RewardValue(double cashValue){
        this.cashValue= cashValue;
        this.milesValue=milesValue;
    }


    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){

        return milesValue;
    }


    public void convertMilesToCash(double milesValue){
        double cashValue=milesValue*rate;
        System.out.println(cashValue);
    } public void convertCashToMiles(double cashValue){
        double milesValue=cashValue/rate;
        System.out.println(milesValue);
    }

}

