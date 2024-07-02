package com.example.students.service

import com.example.students.model.Student
import com.example.students.repository.StudentRepository
import com.netflix.discovery.converters.Auto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class StudentService {
    @Autowired

    lateinit var studentRepository: StudentRepository

    fun list(): List<Student> {
        return studentRepository.findAll()
    }
}

