/**
 * @author TanYuan
 * @date 2022年05月10日 21:38
 */
public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式+品牌）
        FoldedPhone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }
}
