public class OtherThing {
    private String name;
    private Integer value;

    public OtherThing() {
        this.name = null;
        this.value = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void noFunctionality() {
        boolean condition = false;
        while (condition) {
            System.out.println("This will never get executed.");
        }
    }
}
