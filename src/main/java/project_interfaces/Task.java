
    package project_interfaces;

    /**
     * Interface que representa uma tarefa genérica.
     * Define os métodos essenciais para gerenciar os atributos de uma tarefa.
     */
    public interface Task {
        
        /**
         * Obtém o ID do usuário associado à tarefa.
         * 
         * @return o ID do usuário.
         */
        Integer getUserID();
    
        /**
         * Define o ID do usuário associado à tarefa.
         * 
         * @param userID o ID do usuário.
         */
        void setUserID(Integer userID);
    
        /**
         * Obtém o UUID do usuário associado à tarefa.
         * 
         * @return o UUID do usuário.
         */
        String getUserUuid();
    
        /**
         * Define o UUID do usuário associado à tarefa.
         * 
         * @param userUuid o UUID do usuário.
         */
        void setUserUuid(String userUuid);
    
        /**
         * Obtém o título da tarefa.
         * 
         * @return o título da tarefa.
         */
        String getTitle();
    
        /**
         * Define o título da tarefa.
         * 
         * @param title o título da tarefa.
         */
        void setTitle(String title);
    
        /**
         * Obtém a tag da tarefa.
         * 
         * @return a tag da tarefa.
         */
        String getTag();
    
        /**
         * Define a tag da tarefa.
         * 
         * @param tag a tag da tarefa.
         */
        void setTag(String tag);
    
        /**
         * Obtém a descrição da tarefa.
         * 
         * @return a descrição da tarefa.
         */
        String getDescription();
    
        /**
         * Define a descrição da tarefa.
         * 
         * @param description a descrição da tarefa.
         */
        void setDescription(String description);
    
        /**
         * Obtém o status da tarefa.
         * 
         * @return o status da tarefa.
         */
        int getStatus();
    
        /**
         * Define o status da tarefa.
         * 
         * @param status o status da tarefa.
         */
        void setStatus(int status);
    
        /**
         * Obtém a prioridade da tarefa.
         * 
         * @return a prioridade da tarefa.
         */
        int getPriority();
    
        /**
         * Define a prioridade da tarefa.
         * 
         * @param priority a prioridade da tarefa.
         */
        void setPriority(int priority);
    
        /**
         * Verifica se a tarefa está marcada para exclusão.
         * 
         * @return {@code true} se a tarefa está marcada para exclusão, caso contrário {@code false}.
         */
        Boolean getIsDelete();
    
        /**
         * Define se a tarefa está marcada para exclusão.
         * 
         * @param isDelete {@code true} se a tarefa está marcada para exclusão, caso contrário {@code false}.
         */
        void setIsDelete(Boolean isDelete);
    
        /**
         * Verifica se a tarefa está concluída.
         * 
         * @return {@code true} se a tarefa está concluída, caso contrário {@code false}.
         */
        Boolean getIsDone();
    
        /**
         * Define se a tarefa está concluída.
         * 
         * @param isDone {@code true} se a tarefa está concluída, caso contrário {@code false}.
         */
        void setIsDone(Boolean isDone);
    
        /**
         * Obtém o tipo da tarefa.
         * 
         * @return o tipo da tarefa.
         */
        String getTypeTask();
    
        /**
         * Define o tipo da tarefa.
         * 
         * @param typeTask o tipo da tarefa.
         */
        void setTypeTask(String typeTask);
    }
    