package labsheet7.exercise3;

public class Institute {
    private String name;
    private Department department[];

    public Institute(String name, Department department[]){
        setName(name);
        setDepartment(department);
    }
    public void setName(String name){

        this.name = name;
    }
    public void setDepartment(Department department[]){

        this.department = department;
    }
    public String getName(){

        return name;
    }
    public Department[] getDepartment(){
        return department;
    }
    //public int getTotalStudents(){
    //}
    public String toString(){

        for(int i=0; i<department.length; i++)
        {
            if(department[i] != null)
                System.out.println(department[i]);
        }


        return "Name: "+getName() + "  Department: \n\n"+getDepartment();
    }


}
