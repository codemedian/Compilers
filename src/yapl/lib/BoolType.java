package yapl.lib;

/**
 *
 * @author richie
 */
public class BoolType extends Type {
    private boolean value;

    public BoolType() {
    }

    public BoolType(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
    
    @Override
    public boolean isCompatible(Type other) {
        return other instanceof BoolType;
    }
}
