package project_interfaces;

/**
 * Interface que representa uma tarefa expirada.
 * Estende a interface {@link Task} e adiciona métodos específicos para gerenciar
 * datas de início, prazos e extensões de prazos das tarefas.
 */
public interface ExpiredTask extends Task {
    
    /**
     * Obtém o prazo da tarefa.
     * 
     * @return uma {@code String} representando o prazo da tarefa.
     */
    public String getDeadline();

    /**
     * Define o prazo da tarefa.
     * 
     * @param deadline uma {@code String} representando o prazo da tarefa.
     */
    public void setDeadline(String deadline);

    /**
     * Obtém a data de início da tarefa.
     * 
     * @return uma {@code String} representando a data de início da tarefa.
     */
    public String getStartDate();

    /**
     * Define a data de início da tarefa.
     * 
     * @param startDate uma {@code String} representando a data de início da tarefa.
     */
    public void setStartDate(String startDate);

    /**
     * Obtém a extensão do prazo da tarefa.
     * 
     * @return uma {@code String} representando a extensão do prazo da tarefa.
     */
    public String getExtension();

    /**
     * Define a extensão do prazo da tarefa.
     * 
     * @param extension uma {@code String} representando a extensão do prazo da tarefa.
     */
    public void setExtension(String extension);
}