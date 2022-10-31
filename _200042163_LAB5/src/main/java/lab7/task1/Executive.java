package lab7.task1;

public class Executive implements  IMastersProgram {
    public String major;
    public Executive(String major){
        this.major=major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        if(cgpa>=3.75f || this.major.equals(major)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getMarks(int TheoryMarks, int ThesisMarks, int ProjectMarks){
        return TheoryMarks;
    }
}
