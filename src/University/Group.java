package University;

import java.util.List;

public class Group {

    private String groupName;
    private int groupSize;
    private List<Student> students;
    private Student groupPresident;

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Group(String groupName, List<Student> students){
        this.groupName = groupName;
        this.students = students;
        this.groupSize = students.size();
    }

    public void chooseGroupPresident(){
        if(students == null || groupSize == 0){
            throw new NullPointerException("students list is empty");
        }
        groupPresident = students.get(0);
        for (Student student : students) {
            if(student.getKnowladgeEstimation() > groupPresident.getKnowladgeEstimation()){
                groupPresident = student;
            }
        }
        showGroupPresident();
    }

    public void showGroupPresident(){
        if(groupPresident == null){
            throw new NullPointerException("Group president is not chosen");
        }
        System.out.println(new StringBuilder()
                .append("Group's ")
                .append(groupName)
                .append(" president is:"));
        groupPresident.showInfo();
    }
}
