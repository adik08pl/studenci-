package com.stempien.studenci;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class StudenciController {
    private final StudentService studentService;

    public StudenciController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String showHelloPage(Model model) {
        List<Student> books = studentService.getAll();
        model.addAttribute("books", books);
        model.addAttribute("formData", new StudentsSave());
        return "library";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(Model model,
                           @ModelAttribute("formData") StudentsSave formData) {
        studentService.save(formData.getFirstName(), formData.getLastName(),
                formData.getYear(), formData.getIsFemale());
        return showHelloPage(model);
    }

}
