package ku.cs.kafe.repository;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import ku.cs.kafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
