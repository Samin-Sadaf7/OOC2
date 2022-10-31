package LAB6;

public class PermanentWorker extends Worker{
    @Override
    public  double yearlyVacation(){
        double vacation= this.WorkingDays*0.03+20;
        return vacation;
    }
    @Override
    public double yearlyWage(){
        double yearly_wage= 12*(this.BaseWage+this.BaseWage*0.3 +this.BaseWage*0.2);
        return yearly_wage;
    }
    public PermanentWorker(int WorkingDays , int BaseSalary){
            this.WorkingDays=WorkingDays;
            this.BaseWage=BaseSalary;
    }
}
