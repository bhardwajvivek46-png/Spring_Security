package com.security.SpringSecurity.StudentService;

import com.security.SpringSecurity.Entity.Student;
import com.security.SpringSecurity.StudentRepository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final CacheManager cacheManager;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void saveStudents(List<Student> student) {
        studentRepository.saveAll(student);
    }

    @Cacheable("student")
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);

    }
}
