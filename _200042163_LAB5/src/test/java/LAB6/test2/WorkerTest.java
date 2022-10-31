package LAB6.test2;
import LAB6.Worker;
import LAB6.DayLabourerWorker;
import LAB6.PermanentWorker;
import LAB6.MonthlyContractWorker;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class WorkerTest {
    @Test
    public void Test_DayLabourer_Vacation(){
        DayLabourerWorker labourer= new DayLabourerWorker(20, 100);
        assertEquals(0,labourer.yearlyVacation());
    }
    @Test
    public void Test_DayLabourer_Wage(){
        DayLabourerWorker labourer= new DayLabourerWorker(20, 100);
        double wage= 12*20*100/2;
        assertEquals(wage,labourer.yearlyWage());
    }
    @Test
    public void Test_MonthlyContract_Vacation(){
        MonthlyContractWorker contractWorker= new MonthlyContractWorker(20, 100);
        assertEquals(21.0,contractWorker.yearlyVacation());
    }
    @Test
    public void Test_MonthlyContract_Wage(){
        MonthlyContractWorker contractWorker= new MonthlyContractWorker(20, 100);
        assertEquals(1200.0,contractWorker.yearlyWage());
    }
    @Test
    public void Test_PermanentWorker_Vacation(){
        PermanentWorker permanentWorker= new PermanentWorker(21,100);
        assertEquals(20.63, permanentWorker.yearlyVacation());
    }
    @Test
    public void Test_PermanentWorker_Wage(){
        PermanentWorker permanentWorker= new PermanentWorker(21,100);
        assertEquals(1800.0, permanentWorker.yearlyWage());
    }
    @Test
    public void Test_CheckObject_Type(){
        PermanentWorker permanentWorker= new PermanentWorker(20,100);
        DayLabourerWorker dayLabourerWorker= new DayLabourerWorker(20,100);
        MonthlyContractWorker monthlyContractWorker= new MonthlyContractWorker(20,100);
        assertTrue(permanentWorker instanceof  Worker);
        assertTrue(dayLabourerWorker instanceof  Worker);
        assertTrue(monthlyContractWorker instanceof  Worker);
    }
}
