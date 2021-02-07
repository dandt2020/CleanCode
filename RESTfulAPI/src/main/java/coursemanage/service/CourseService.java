package coursemanage.service;

import coursemanage.dto.CourseDto;
import coursemanage.entity.Course;
import coursemanage.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<CourseDto> getCourses(String keyword, String sortBy) {
        List<Course> courses = courseRepository.findByNameLike(keyword, Sort.by(sortBy));
        return courses
                .stream()
                .map(course -> modelMapper.map(course, CourseDto.class))
                .collect(Collectors.toList());
    }
}
