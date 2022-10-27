package labsheet7.exercise3;

public class Department {

    private String name;
    private Student student[];

    public Department(String name, Student student[]){
        setName(name);
        setStudent(student);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudent(Student[] student){
        this.student = student;
    }
    public String getName(){
        return name;
    }

    public Student[] getStudent() {
        return student;
    }
    public String toString(){

        for(int i=0; i<student.length; i++)
        {
            if(student[i]!= null)
                System.out.println(student[i]);
        }
        return "  Name: " + getName() + "  List of Students: "+getStudent();
    }
}
