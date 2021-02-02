package coursemanage.controller;

import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import coursemanage.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/v1/users")
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully")
    })
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
