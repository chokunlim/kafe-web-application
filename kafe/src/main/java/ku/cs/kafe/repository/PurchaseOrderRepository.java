package ku.cs.kafe.repository;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import ku.cs.kafe.common.Status;
import ku.cs.kafe.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, UUID> {


    PurchaseOrder findByStatus(Status status);
}
