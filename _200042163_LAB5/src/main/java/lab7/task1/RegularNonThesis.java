package lab7.task1;

public class RegularNonThesis implements  IMastersProgram{
    public String major;
    public RegularNonThesis(String major){
        this.major=major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        if(this.major.equals(major)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getMarks(int TheoryMarks, int ThesisMarks, int ProjectMarks){
        return TheoryMarks+ProjectMarks/2;
    }
}
