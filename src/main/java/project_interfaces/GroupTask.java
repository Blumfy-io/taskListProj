package project_interfaces;

/**
 * Interface que representa uma tarefa de grupo.
 * Estende a interface {@link Task} e adiciona métodos específicos para gerenciar
 * os IDs e UUIDs dos usuários associados à tarefa.
 */
public interface GroupTask extends Task {
    
    /**
     * Obtém os IDs dos usuários associados à tarefa.
     * 
     * @return um array de {@code Integer} contendo os IDs dos usuários.
     */
    public Integer[] usersID();

    /**
     * Define os IDs dos usuários associados à tarefa.
     * 
     * @param usersID um array de {@code Integer} contendo os IDs dos usuários.
     */
    public void setUserID(Integer[] usersID);

    /**
     * Obtém os UUIDs dos usuários associados à tarefa.
     * 
     * @return um array de {@code String} contendo os UUIDs dos usuários.
     */
    public String[] getUsersUuid();

    /**
     * Define os UUIDs dos usuários associados à tarefa.
     * 
     * @param usersUuid um array de {@code String} contendo os UUIDs dos usuários.
     */
    public void setUserUuid(String[] usersUuid);

    /**
     * Compartilha a tarefa com base nos IDs dos usuários.
     * 
     * @param usersID um array de {@code Integer} contendo os IDs dos usuários com quem a tarefa será compartilhada.
     */
    public void shareTask(Integer[] usersID);

    /**
     * Compartilha a tarefa com base nos UUIDs dos usuários.
     * 
     * @param usersUuid um array de {@code String} contendo os UUIDs dos usuários com quem a tarefa será compartilhada.
     */
    public void shareTask(String[] usersUuid);
}
