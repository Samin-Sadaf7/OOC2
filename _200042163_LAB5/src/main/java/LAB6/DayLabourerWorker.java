package LAB6;

public class DayLabourerWorker extends Worker{
    @Override
    public double yearlyVacation(){
        double vacation= 0;
        return vacation;
    }
    @Override
    public double yearlyWage(){
        double yearly_wage= 12*(this.BaseWage*this.WorkingDays/2);
        return yearly_wage;
    }
    public DayLabourerWorker(int WorkingDays , int BaseSalary){
        this.WorkingDays=WorkingDays;
        this.BaseWage=BaseSalary;
    }
}
