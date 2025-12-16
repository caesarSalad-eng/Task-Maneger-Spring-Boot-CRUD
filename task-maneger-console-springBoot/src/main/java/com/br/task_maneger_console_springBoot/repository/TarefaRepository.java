package com.br.task_maneger_console_springBoot.repository;

import com.br.task_maneger_console_springBoot.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
