package labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student ComputingStudents[] = new Student[10];
        Student creativeMedia[] = new Student[10];
        Department departments[] = new Department[5];

        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary","Creative Media");
        Student student3 = new Student(623456, "Tommy","Computing");
        Student student4 = new Student(623456, "Peter","Creative Media");



        ComputingStudents[0] = student1;
        ComputingStudents[1] = student3;
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department department1 = new Department("Computing", ComputingStudents);
        Department department2 = new Department("Creative Media", creativeMedia);

        departments[0] = department1;
        departments[1] = department2;

        Institute institute = new Institute("Institute of Technology, Tralee", departments);

        int creativeMediaSubscript=-1, computingSubscript=-1;

        System.out.println(institute);

        for(int i=0;i<departments.length;i++) {
            if (departments[i] != null && departments[i].getName().equals("Creative Media"))
                creativeMediaSubscript = i;

            if (departments[i] != null && departments[i].getName().equals("Computing"))
                computingSubscript = i;

        }

        if (creativeMediaSubscript!=-1 && computingSubscript!=-1) {

            Student[] allDeptStudents = departments[computingSubscript].getStudent();

            int j;

            for (j = 0; j < allDeptStudents.length; j++) {
                if (allDeptStudents[j] != null) {
                    if (allDeptStudents[j].getId() == 154345) {
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDepartment("Creative Media");

                        departments[creativeMediaSubscript].getStudent()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }

            if(j==allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
        System.out.println(institute);
    }
}
