import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();
        HashMap<String, String> skill1 = new HashMap<String, String>();
        HashMap<String, String> skill2 = new HashMap<String, String>();
        HashMap<String, String> skill3 = new HashMap<String, String>();

        skill1.put("java", "java core");
        skill1.put("html", "html5");
        skill1.put("english", "intermediate");

        skill2.put("javascript", "js basic");
        skill2.put("english", "pre-intermediate");
        skill2.put("junit", "junit4 junit5");

        skill3.put("english", "upper-intermediate");
        skill3.put("c++", "c++ junior");
        skill3.put("test", "test manual");


        myCompany.addEmployeeMap("Serj", 25, "Hillel", skill1);
        myCompany.addEmployeeMap("Alex", 30, "Hillel", skill2);
        myCompany.addEmployeeMap("Serj1", 33, "Hillel", skill3);

        // show all of employees, Map
        System.out.println("All of employees:");
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName()+ " " + currentEmployee.getProjectName() + " " +
                currentEmployee.getSkillMap());
        }

        myCompany.addEmployeeSkillMap("Alex", "test", "test manual");
        System.out.println("Added skill, Map:");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+ " " + currentEmployee.getProjectName() + " " +
                    currentEmployee.getSkillMap());
        }

        myCompany.removeEmployeeSkillMap("Alex", "javascript");
        System.out.println("Remove skill, Map:");
        System.out.println(myCompany.getEmployeeByNameMap("Alex").getName() + " " +
                myCompany.getEmployeeSkillMap("Alex"));

        //Set
        HashSet<Skill> set1 = new HashSet<Skill>();
        HashSet<Skill> set2 = new HashSet<Skill>();
        HashSet<Skill> set3 = new HashSet<Skill>();

        myCompany.addEmployeeSkillSet("Alex", "Java", "Core", 2);
        myCompany.addEmployeeSkillSet("Alex", "English", "Upper-intermediate", 5);
        myCompany.addEmployeeSkillSet("Serj", "C++", "Enterprise", 5);
        myCompany.addEmployeeSkillSet("Serj1","Test", "Manual", 8);

        System.out.println("Add employees skills, set:");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            for(Skill sk:currentEmployee.getSkillSet()){
            System.out.println(currentEmployee.getName() + " " + sk);
            }
}

        myCompany.removeEmployeeSkillSet("Alex", "English");
        System.out.println("Remove employees skills, set:");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            for (Skill sk : currentEmployee.getSkillSet()) {
                System.out.println(currentEmployee.getName() + " " + sk);
            }
        }


/*
        // delete employee
        myCompany.deleteEmployeeByName("Alex");
        System.out.println("After deleted:");
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }

        //add employee
        myCompany.addEmployee("Ann", 28, "Hillel2");
        System.out.println("After added employee:");
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName() + " " + currentEmployee.getProjectName());
            }

        //edit employee
        //update employee name
        myCompany.updateEmployeeName("Serj1", "Serg2");
        System.out.println("After update name employee:");
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }

        //set project name
        myCompany.editEmployeeProjectName("Ann", "Hillel");
        System.out.println("After edit employee project name:");
        System.out.println(myCompany.getEmployeeByName("Ann").getName() + " "
                         + myCompany.getEmployeeByName("Ann").getProjectName());

        //clear project name
        myCompany.clearEmployeeProjectName("Ann", "Hillel");
        System.out.println("After clear employee project name:");
            System.out.println(myCompany.getEmployeeByName("Ann").getName() + " "
                             + myCompany.getEmployeeByName("Ann").getProjectName());
*/
    }
}