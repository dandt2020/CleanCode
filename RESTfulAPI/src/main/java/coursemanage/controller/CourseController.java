package coursemanage.controller;

import coursemanage.dto.CourseDto;
import coursemanage.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/api/v1/courses/")
    @ApiOperation("Get courses")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get course successfully"),
            @ApiResponse(code = 404, message = "Course not found")
    })
    public ResponseEntity<EntityModel<CourseDto>> getCourses(
            @ApiParam(value = "Keyword") String keyword, @ApiParam(value = "Sort by") String sortBy
    ) {
        List<CourseDto> response = courseService.getCourses(keyword, sortBy);
        CollectionModel<CourseDto> collectionModel = CollectionModel.of(response);

        return new ResponseEntity<>(collectionModel, HttpStatus.OK);
    }

}
