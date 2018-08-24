package Builders;

import Entities.Professor;
import Utils.InfoGenerator;

public class ProfessorBuilder{
    private static InfoGenerator info = new InfoGenerator();
    private Professor[] professors;

    private ProfessorBuilder(int professorsNumber){
        professors = new Professor[professorsNumber];

        for (int i=0; i< professorsNumber; i++){
            professors[i] = new Professor(info.getFirstName(), info.getLastName(), info.getAge(), info.getGenderState());
        }
    }

    public static Professor[] getProfessors(int professorsNumber){

        if(professorsNumber < 1){
            throw new IllegalArgumentException("You enter an invalid value: " + professorsNumber);
        }

        return new ProfessorBuilder(professorsNumber).professors;
    }
}
