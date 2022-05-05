package generalization;

/**
 * @author TanYuan
 * @date 2022年05月05日 22:19
 */
public abstract class DaoSupport {
    public void save(Object entity){}
    public void delete(Object id) {}
}

class PersonServiceBean extends DaoSupport {

}
