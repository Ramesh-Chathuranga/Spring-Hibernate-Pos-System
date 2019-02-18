package lk.ijse.dep.app.dao.custom.impl;

import lk.ijse.dep.app.dao.CrudDAOImpl;
import lk.ijse.dep.app.dao.custom.OrderDAO;
import lk.ijse.dep.app.entity.Orders;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class OrderDAOImpl  extends CrudDAOImpl<Orders, String> implements OrderDAO {
    @Override
    public int count() throws Exception {
        return 0;
    }
}
