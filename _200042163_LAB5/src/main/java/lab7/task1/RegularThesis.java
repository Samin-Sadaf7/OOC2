package lab7.task1;

public class RegularThesis implements  IMastersProgram{
    public String major;
    public RegularThesis(String major){
            this.major=major;
        }
    @Override
    public boolean isEligible(float cgpa, String major) {
            if(cgpa>=3.8 && this.major.equals(major)){
                return true;
            }
            else{
                 return false;
            }
         }

    @Override
        public int getMarks(int TheoryMarks, int ThesisMarks, int ProjectMarks){
                return TheoryMarks+ThesisMarks;
        }
}
