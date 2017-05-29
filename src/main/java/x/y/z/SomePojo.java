package x.y.z;

public class SomePojo {
    
    private int value;
    
    public SomePojo(int value) {
        super();
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SomePojo [value=" + value + "]";
    }
    
}
