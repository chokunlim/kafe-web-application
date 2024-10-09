package ku.cs.kafe.repository;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository
        extends JpaRepository<OrderItem, OrderItemKey> {
}
