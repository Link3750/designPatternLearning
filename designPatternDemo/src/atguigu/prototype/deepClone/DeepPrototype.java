package atguigu.prototype.deepClone;

import java.io.*;

/**
 * @author TanYuan
 * @date 2022年04月18日 21:40
 */
public class DeepPrototype implements Serializable, Cloneable {

    public String name;

    public DeepCloneableTarget target;

    public DeepPrototype() {
        super();
    }

    /**
     * 深拷贝方式1，使用clone方法
     */
    @Override
    protected Object clone() {

            Object deep = null;
        try {
            // 完成对基本数据类型、字符串的克隆
            deep = super.clone();
            // 对引用类型的属性进行单独处理
            DeepPrototype deepPrototype = (DeepPrototype) deep;
            deepPrototype.target = target.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deep;
    }

    public DeepPrototype deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化操作
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的形式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return  (DeepPrototype) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("错误");
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                throw new RuntimeException("错误");
            }
        }
    }
}





