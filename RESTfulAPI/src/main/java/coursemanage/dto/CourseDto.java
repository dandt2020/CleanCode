package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CourseDto extends RepresentationModel<CourseDto> {
    @ApiModelProperty(value = "Course ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "Course name", example = "Clean code")
    private String name;

    @NotNull
    @ApiModelProperty(value = "Course location", example = "Ha Noi")
    private String location;

    @NotNull
    @ApiModelProperty(value = "Course teacher", example = "Join")
    private String teacherName;
}
