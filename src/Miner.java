import com.company.Employee;

public class Miner extends Employee {
    private int miningSkillLevel;

    public Miner(String name, int age, double salary, int miningSkillLevel) {
        super(name, age, salary);
        this.miningSkillLevel = miningSkillLevel;
    }

    public int getMiningSkillLevel() {
        return miningSkillLevel;
    }

    public void setMiningSkillLevel(int miningSkillLevel) {
        this.miningSkillLevel = miningSkillLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " | Mining Skill Level: " + miningSkillLevel;
    }
}
