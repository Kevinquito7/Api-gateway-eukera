package com.example.students.model

import jakarta.persistence.*

@Table(name = "student")
@Entity
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    var id: Long? = null
    var firtsName: String? = null
    var lastName:String? = null
}
