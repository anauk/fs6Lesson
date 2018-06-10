package patterns.dao;

public class DaoTest {
    public static void main(String[] args) {
        DAO<Customer> data =
                new CustomerDAOSQL()
                //new CustomerDAOHashMap()
                ;


        Customer customer = data.get(1);
    }
}
