package project_classes;

import project_interfaces.Task;

/**
 * Modelo de tarefa que representa uma tarefa genérica com atributos básicos.
 */

public class TaskModel implements Task {

    private Integer userID;
    private String userUuid;
    private String title;
    private String tag;
    private String description;
    private int status;
    private int priority;
    private Boolean isDelete;
    private Boolean isDone;
    private String typeTask;

    /**
     * Construtor padrão da classe TaskModel.
     */

    public TaskModel() {
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
	}
      /**
     * Construtor da classe TaskModel com parâmetros.
     * @param userID ID do usuário.
     * @param userUuid UUID do usuário.
     * @param title Título da tarefa.
     * @param tag Tag da tarefa.
     * @param description Descrição da tarefa.
     * @param typeTask Tipo da tarefa.
     */

    public TaskModel(Integer userID, String title, String tag, String description, String typeTask) {
		this.userID = userID;
		this.title = title;
		this.tag = tag;
		this.description = description;
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
		this.typeTask = typeTask;
	}

    public TaskModel(Integer userID, String title, String tag, String description, String typeTask, String userUuid) {
		this.userID = userID;
		this.userUuid = userUuid;
		this.title = title;
		this.tag = tag;
		this.description = description;
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
		this.typeTask = typeTask;
	}

	// Getters e Setters para userID
    /**
     * Obtém o ID do usuário.
     * @return o ID do usuário.
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Define o ID do usuário.
     * @param userID o ID do usuário.
     */
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    // Getters e Setters para userUuid
    /**
     * Obtém o UUID do usuário.
     * @return o UUID do usuário.
     */
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    // Getters e Setters para title
     /**
     * Obtém o título da tarefa.
     * @return o título da tarefa.
     */
    public String getTitle() {
        return title;
    }
    /**
    * Define o título da tarefa.
    * @param title o título da tarefa.
    */
    public void setTitle(String title) {
        this.title = title;
    }

    // Getters e Setters para tag
    /**
     * Obtém a tag da tarefa.
     * @return a tag da tarefa.
     */
    public String getTag() {
        return tag;
    }
    /**
     * Define a tag da tarefa.
     * @param tag a tag da tarefa.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    // Getters e Setters para description
    /**
     * Obtém a descrição da tarefa.
     * @return a descrição da tarefa.
     */
    public String getDescription() {
        return description;
    }

     /**
     * Define a descrição da tarefa.
     * @param description a descrição da tarefa.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters e Setters para status
    /**
     * Obtém o status da tarefa.
     * @return o status da tarefa.
     */
    public int getStatus() {
        return status;
    }
     /**
     * Define o status da tarefa.
     * @param status o status da tarefa.
     */
    public void setStatus(int status) {
        this.status = status;
    }

    // Getters e Setters para priority
    /**
     * Obtém a prioridade da tarefa.
     * @return a prioridade da tarefa.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Define a prioridade da tarefa.
     * @param priority a prioridade da tarefa.
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Getters e Setters para isDelete

    /**
     * Verifica se a tarefa está marcada para exclusão.
     * @return true se a tarefa está marcada para exclusão, caso contrário false.
     */

    public Boolean getIsDelete() {
        return isDelete;
    }

       /**
     * Define se a tarefa está marcada para exclusão.
     * @param isDelete true se a tarefa está marcada para exclusão, caso contrário false.
     */

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    // Getters e Setters para isDone

    /**
     * Verifica se a tarefa está concluída.
     * @return true se a tarefa está concluída, caso contrário false.
     */

    public Boolean getIsDone() {
        return isDone;
    }

      /**
     * Define se a tarefa está concluída.
     * @param isDone true se a tarefa está concluída, caso contrário false.
     */

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    // Getters e Setters para typeTask

    /**
     * Obtém o tipo da tarefa.
     * @return o tipo da tarefa.
     */

    public String getTypeTask() {
        return typeTask;
    }
    /**
     * Define o tipo da tarefa.
     * @param typeTask o tipo da tarefa.
     */
    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }
}
