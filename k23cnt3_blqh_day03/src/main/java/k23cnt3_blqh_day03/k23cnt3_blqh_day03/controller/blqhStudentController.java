package k23cnt3_blqh_day03.k23cnt3_blqh_day03.controller;

import k23cnt3_blqh_day03.k23cnt3_blqh_day03.entity.blqhStudent;
import k23cnt3_blqh_day03.k23cnt3_blqh_day03.service.blqhServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class blqhStudentController {
    @Autowired
    private blqhServiceStudent studentService;
    @GetMapping("/student-list")
    public List<blqhStudent> getAllStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/student/{id}")
    public blqhStudent getAllStudents(@PathVariable String id)
    {
        Long param = Long.parseLong(id);
        return studentService.getStudent(param);
    }
    @PostMapping("/student-add")
    public blqhStudent addStudent(@RequestBody blqhStudent student)
    {
        return studentService.addStudent(student);
    }
    @PutMapping("/student/{id}")
    public blqhStudent updateStudent(@PathVariable String id,
                                 @RequestBody blqhStudent student) {
        Long param = Long.parseLong(id);
        return studentService.updateStudent(param,
                student);
    }
    @DeleteMapping("/student/{id}")
    public boolean deleteStudent(@PathVariable String id) {
        Long param = Long.parseLong(id);
        return studentService.deleteStudent(param);
    }
}

