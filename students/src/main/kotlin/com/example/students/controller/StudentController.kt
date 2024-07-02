package com.example.students.controller

import com.example.students.model.Student
import com.example.students.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")

class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list(): String {
        return "Aqui retornan los estudiantes"
    }
}