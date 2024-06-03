package project_interfaces;

import java.util.List;

/**
 * Interface que representa uma lista de tarefas.
 * Define os métodos essenciais para gerenciar a criação, modificação e controle do status das tarefas em uma lista.
 */
public interface TaskList {

    /**
     * Marca a tarefa especificada pelo título como concluída.
     * 
     * @param title o título da tarefa a ser marcada como concluída.
     */
    public void done(String title);

    /**
     * Inicia a tarefa especificada pelo título.
     * 
     * @param title o título da tarefa a ser iniciada.
     */
    public void start(String title);

    /**
     * Para a tarefa especificada pelo título.
     * 
     * @param title o título da tarefa a ser parada.
     */
    public void stop(String title);

    /**
     * Cria uma nova tarefa e a adiciona à lista de tarefas.
     * 
     * @param task a tarefa a ser criada e adicionada à lista.
     */
    public void create(Task task);

    /**
     * Retorna a lista de todas as tarefas.
     * 
     * @return uma lista de tarefas.
     */
    public List<Task> list();

    /**
     * Exclui a tarefa especificada pelo título.
     * 
     * @param title o título da tarefa a ser excluída.
     */
    public void delete(String title);

    /**
     * Edita a tarefa especificada pelo título com as informações da nova tarefa fornecida.
     * 
     * @param title o título da tarefa a ser editada.
     * @param task a nova tarefa com as informações atualizadas.
     */
    public void edit(String title, Task task);
}
