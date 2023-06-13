package phuc.daytoday.todolist.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import phuc.daytoday.todolist.domain.entities.Todolist;

import java.util.List;


@Repository
public interface TodolistRepository extends JpaRepository<Todolist, Long> {
}
