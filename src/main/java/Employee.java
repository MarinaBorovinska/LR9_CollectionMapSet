import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Employee {
    private String name;
    private int age;
    private String projectName;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // ------------Map-----------

    private HashMap<String, String> skillMap = new HashMap<String, String>();

    public Employee(String name, int age, String projectName, HashMap<String, String> skillMap) {
        this.name = name;
        this.age = age;
        this.projectName = projectName;
        this.skillMap = skillMap;
    }

    public HashMap<String, String> getSkillMap() {
        return skillMap;
    }

    public void setSkillMap(HashMap<String, String> skillMap) {
        this.skillMap = skillMap;
    }

    public void addSkillMap(String skillName, String skillDescription){
        skillMap.put(skillName, skillDescription);
    }

    public void removeSkillMap (String skillName){
        skillMap.remove(skillName);
    }

    //-----------------Set-------------------

    private HashSet<Skill> skillSet = new HashSet<Skill>();

    public Employee(String name, int age, String projectName, HashSet<Skill> skillSet) {
        this.name = name;
        this.age = age;
        this.projectName = projectName;
        this.skillSet = skillSet;
    }

    public HashSet<Skill> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(HashSet<Skill> skillSet) {
        this.skillSet = skillSet;
    }

    public void addSkillSet(String skillName, String skillDescription, int skillLevel) {
        skillSet.add(new Skill(skillName, skillDescription, skillLevel));
    }

    public void removeSkillSet(String skillName) {
         skillSet.clear();
    }
}
