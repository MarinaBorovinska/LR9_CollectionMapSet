public class Skill {
    private String skillName;
    private String skillDescription;
    private int skillLevel;

    public Skill(String skillName, String skillDescription, int skillLevel){
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.skillLevel = skillLevel;
    }

    public Skill(){
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String toString(){
        return "skillName: " + skillName + ",  skillDescription: " + skillDescription + ", skillLevel: " + skillLevel;
    }
}
