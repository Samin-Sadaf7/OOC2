package Lab8.task2;

public class Car implements IRadioSwitch, IEngineSwitch{
    @Override
    public boolean RadioOn(){
        return true;
    }
    @Override
    public boolean RadioOff(){
        return false;
    }
    @Override
    public boolean StartEngine(){
        return true;
    }
    @Override
    public boolean EngineOff(){
        return false;
    }
}
