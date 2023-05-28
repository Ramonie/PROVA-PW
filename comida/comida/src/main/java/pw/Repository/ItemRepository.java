package pw.Repository;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class ItemRepository {

    public List<Item> findByDeletedIsNull() {
        return null;
    }

}
