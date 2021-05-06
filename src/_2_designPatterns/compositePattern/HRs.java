package _2_designPatterns.compositePattern;

public class HRs implements Employee {
    private String name;
    private int id;
    private String department;

    public HRs(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public int getId() {return this.id;

    }

    @Override
    public String getDepartment() {
        return this.department;

    }

    @Override
    public String toString() {
        return "HRs{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
