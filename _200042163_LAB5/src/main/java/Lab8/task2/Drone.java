package Lab8.task2;

public class Drone implements ICameraSwitch,IEngineSwitch{
    @Override
    public boolean CameraOn(){
        return true;
    }
    @Override
    public boolean CameraOff(){
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
