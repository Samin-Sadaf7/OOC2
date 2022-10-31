package LAB6;

public class MonthlyContractWorker extends Worker{
    @Override
    public double yearlyVacation(){
        double vacation= 21;
        return vacation;
    }
    @Override
    public double yearlyWage(){
        double yearly_wage= 12*this.BaseWage;
        return yearly_wage;
    }
    public MonthlyContractWorker(int WorkingDays , int BaseSalary){
        this.WorkingDays=WorkingDays;
        this.BaseWage=BaseSalary;
    }
}
