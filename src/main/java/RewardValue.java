public class RewardValue {
    private double cashValue;
    RewardValue()
    {
    }
    RewardValue(double cashValue)
    {
        cashValue = this.cashValue;
    }
    double getMilesValue()
    {
        return cashValue*10;
    }
    double getCashValue()
    {
        return cashValue;
    }
}
