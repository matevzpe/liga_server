package com.liga.controller;

import com.liga.entity.Student;
import com.liga.repository.StudentRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/student")
public class StudentController {
    @Inject
    StudentRepository studentRepository;

    @Post("/")
    Student save(@Body Student student) {
        try{
            Student existingStudent = studentRepository.findById(student.getId()).get();
            return studentRepository.update(student);
        } catch (Exception e){
            return studentRepository.save(student);
        }
    }

    @Get("/{id}")
    Student get(@PathVariable Long id){
        return studentRepository.findById(id).get();
    }

    @Get("/list")
    public List<Student> list(Pageable pageable) {
        return studentRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}


