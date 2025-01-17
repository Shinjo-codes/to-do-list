package com.example.Todo.List.Repository;

import com.example.Todo.List.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {


}
