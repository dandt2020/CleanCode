package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Response DTO
 */
@Data
public class UserResDto {
    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "Email", example = "XYZ@mail.com")
    private String email;
}
