package ku.cs.kafe.request;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
public class MenuRequest {

    @NotBlank
    private String name;


    @NotBlank
    private String categoryName;


    @Positive
    private double price;
}
