package com.br.task_maneger_console_springBoot.service;

import com.br.task_maneger_console_springBoot.model.StatusTarefa;
import com.br.task_maneger_console_springBoot.model.Tarefa;
import com.br.task_maneger_console_springBoot.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository;


    public TarefaService(TarefaRepository tarefaRepository){

        this.tarefaRepository = tarefaRepository;

    }

    public Optional<Tarefa> buscarPorId(Long id){

        return tarefaRepository.findById(id);

    }

    public Optional<Tarefa> concluirTarefa(Long id){

        Optional<Tarefa> optTarefa = tarefaRepository.findById(id);

        if (optTarefa.isPresent()){

            Tarefa tarefa = optTarefa.get();

            tarefa.setStatus(StatusTarefa.COMPLETA);

            tarefaRepository.save(tarefa);

            return Optional.of(tarefa);

        }else{

            return Optional.empty();

        }


    }

    public Tarefa salvarTarefa(Tarefa tarefa){

        return tarefaRepository.save(tarefa);

    }


    public boolean deletarTarefa(Long id){

        if (tarefaRepository.existsById(id)){

            tarefaRepository.deleteById(id);

            return true;

        }else{

            return false;

        }


    }

    public List<Tarefa> findAll(){

        return tarefaRepository.findAll();

    }




}
