package com.ashish.Task.Management.repository;


import com.ashish.Task.Management.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
