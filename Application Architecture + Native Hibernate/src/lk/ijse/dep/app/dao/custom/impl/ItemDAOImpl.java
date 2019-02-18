package lk.ijse.dep.app.dao.custom.impl;

import lk.ijse.dep.app.dao.CrudDAOImpl;
import lk.ijse.dep.app.dao.custom.ItemDAO;
import lk.ijse.dep.app.entity.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ItemDAOImpl  extends CrudDAOImpl<Item, String> implements ItemDAO {
}
