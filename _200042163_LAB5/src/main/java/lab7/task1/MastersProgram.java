package lab7.task1;


public class MastersProgram {
        private IMastersProgram type;
        public MastersProgram(DegreeType type, String major) {
            ChooseMaster cm= new ChooseMaster();
            this.type = cm.chooseMasterProgram(type,major);
        }
        public boolean isEligible(float cgpa, String major) {

            return type.isEligible(cgpa,major) ;
        }
        public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
            return type.getMarks(theoryMarks, thesisMarks, projectMarks);
        }
}

