package atguigu.prototype.deepClone;

import java.io.Serializable;

/**
 * @author TanYuan
 * @date 2022年04月18日 21:38
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    public DeepCloneableTarget clone() {
        try {
            return (DeepCloneableTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
