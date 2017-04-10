import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

 //------------------Map---------------------

    public void addEmployeeMap(String employeeName, int age, String projectName, HashMap<String, String> skillMap) {
        employeeList.add(new Employee(employeeName, age, projectName, skillMap));
    }

    public Employee getEmployeeByNameMap(String employeeName) {
        Employee employeeToReturn = null;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
                break;
            } else {
                HashMap<String, String> empty = new HashMap<String, String>();
                empty.put("Not found", "Not found");
                employeeToReturn = new Employee("Not found", 0, "Not found", empty);
            }
        }
        return employeeToReturn;
    }

    public void addEmployeeSkillMap(String employeeName, String skillName, String skillDescription){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).addSkillMap(skillName, skillDescription);
            }
        }
    }

    public void removeEmployeeSkillMap(String employeeName, String skillName){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).removeSkillMap(skillName);
            }
        }
    }

    public HashMap<String, String> getEmployeeSkillMap(String employeeName){
        HashMap<String, String> skillMap = new HashMap<String, String>();
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                skillMap = employeeList.get(i).getSkillMap();
            }
        }
        return skillMap;
    }

    //----------------Set-------------------

    public Employee getEmployeeByNameSet(String employeeName) {
        Employee employeeToReturn = null;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
                break;
            } else {
                HashSet<Skill> empty = new HashSet<Skill>();
                empty.add(new Skill("Not found", "Not found", 0));
                employeeToReturn = new Employee("Not found", 0, "Not found", empty);
            }
        }
        return employeeToReturn;
    }

    public void addEmployeeSkillSet(String employeeName, String skillName, String skillDescription, int skillLevel){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).addSkillSet(skillName, skillDescription, skillLevel);
            }
        }
    }

    public void removeEmployeeSkillSet(String employeeName, String skillName){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).removeSkillSet(skillName);
            }
        }
    }

    public HashSet<Skill> getEmployeeSkillSet(String employeeName){
        HashSet<Skill> skillSet = new HashSet<Skill>();
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                skillSet = employeeList.get(i).getSkillSet();
            }
        }
        return skillSet;
    }
}


/*
 public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }

    public void deleteEmployeeOlder(int desiredAge) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge() > desiredAge) {
                employeeList.remove(i);
            }
        }
    }
    public void updateEmployeeName(String employeeName, String employeeNewName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setName(employeeNewName);
            }
        }
    }

    public void editEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(projectName);
            }
        }
    }

    public void clearEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName) && employeeList.get(i).getProjectName().equals(projectName)) {
                employeeList.get(i).setProjectName("");
            }
        }
    }
 */