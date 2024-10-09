package ku.cs.kafe.entity;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.UUID;


@Data
@Entity
public class Member {


    @Id
    @GeneratedValue
    private UUID id;


    private String username;
    private String password;
    private String name;
    private String role;
}
