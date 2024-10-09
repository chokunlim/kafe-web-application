package ku.cs.kafe.request;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CategoryRequest {


    @NotBlank
    private String name;


}
