package id.putri.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.putri.springproject.model.dto.EducationDto;
import id.putri.springproject.model.entity.Education;
import id.putri.springproject.model.entity.UserEntity;
import id.putri.springproject.repository.EducationRepository;
import id.putri.springproject.repository.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Data
@NoArgsConstructor
@RequestMapping("/edu")
public class EducationController 
{
    @Autowired
    private EducationRepository educationRepository;

    @Autowired 
    private UserRepository userRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getEdus() {
        List<Education> educations = educationRepository.findAll();
        return ResponseEntity.ok().body(educations);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insertEdu(@RequestBody EducationDto dto) {
        Education education = new Education(dto.getEducationCode(), dto.getSchoolName());

        UserEntity userEntity = userRepository.findByUserName(dto.getUserName());
        education.setUserEntity(userEntity);
        educationRepository.save(education);

        return ResponseEntity.ok().body(education);
    }
}
