import java.util.ArrayList;

public class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<>();

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear+5;
    }

    public UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        this.endYear = startYear+5;
    }

    public void addStudent(String student) {
        studentList.add(student);
    }

    public boolean removeStudent(String student) {
        return studentList.remove(student);
    }

    public void getGroupDescription() {
        System.out.println("groupName="+getGroupName());
        System.out.println("startYear="+getStartYear());
        System.out.println("endYear="+getEndYear());
        System.out.println("studentList="+getStudentList());
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public static void main(String[] args) {
        UniversityGroup group1 = new UniversityGroup("Mozgi", 2021);
        group1.addStudent("Vadim");
        group1.addStudent("Bogdan");
        group1.addStudent("Vitya");
        group1.addStudent("Max");
        group1.addStudent("Valera");

        ArrayList<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Artur Pirojkov");
        list.add("Alex");
        list.add("Danil");
        list.add("Gosha");
        UniversityGroup group2 = new UniversityGroup("Mozgi2", 2021, list);

        group1.removeStudent("Valera");
        group2.removeStudent("Alex");

        group1.getGroupDescription();
        group2.getGroupDescription();
    }
}
