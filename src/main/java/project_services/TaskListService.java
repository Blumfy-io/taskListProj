package project_services;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import project_classes.TaskModel;
import project_interfaces.Task;
import project_interfaces.TaskList;

/**
 * Classe que implementa a interface {@link TaskList} para gerenciar uma lista de tarefas.
 * Fornece métodos para criar, iniciar, parar, concluir, excluir e editar tarefas, bem como listar todas as tarefas.
 */
public class TaskListService implements TaskList {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    List<Task> mainList = new ArrayList();

    @SuppressWarnings({ "rawtypes", "unchecked" })
    List<Task> startedList = new ArrayList();

    @SuppressWarnings({ "rawtypes", "unchecked" })
    List<Task> doneList = new ArrayList();

    @SuppressWarnings({ "rawtypes", "unchecked" })
    List<Task> deletedList = new ArrayList();

    /**
     * Marca a tarefa especificada pelo título como concluída.
     * Move a tarefa da lista principal ou da lista de tarefas iniciadas para a lista de tarefas concluídas.
     * 
     * @param title o título da tarefa a ser marcada como concluída.
     */
    public void done(String title) {
        startedList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                startedList.remove(t);
                doneList.add(t);
            }
        });
        mainList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                mainList.remove(t);
                doneList.add(t);
            }
        });
    }

    /**
     * Inicia a tarefa especificada pelo título.
     * Move a tarefa da lista principal para a lista de tarefas iniciadas.
     * 
     * @param title o título da tarefa a ser iniciada.
     */
    public void start(String title) {
        mainList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                mainList.remove(t);
                startedList.add(t);
            }
        });
    }

    /**
     * Para a tarefa especificada pelo título.
     * Move a tarefa da lista de tarefas iniciadas para a lista principal.
     * 
     * @param title o título da tarefa a ser parada.
     */
    public void stop(String title) {
        mainList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                startedList.remove(t);
                mainList.add(t);
            }
        });
    }

    /**
     * Cria uma nova tarefa e a adiciona à lista principal de tarefas.
     * 
     * @param task a tarefa a ser criada e adicionada à lista.
     */
    public void create(Task task) {
        mainList.add(task);
    }

    /**
     * Retorna a lista de todas as tarefas, incluindo as tarefas iniciadas, principais, concluídas e excluídas,
     * a menos que marcado para remoção por uma anotação.
     * 
     * @return uma lista de todas as tarefas.
     */
    public List<Task> list() {
        Class<?> taskClass;
        List<Task> list = startedList;
        taskClass = TaskModel.class;
        try {
            Field[] fields = taskClass.getDeclaredFields();
            Set<String> ignoreFields = new LinkedHashSet<>();

            for (Field field : fields) {
                Annotation[] annotations = field.getDeclaredAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation.annotationType().getSimpleName().equals("RemoveAsListParameter")) {
                        ignoreFields.add(field.getName());
                    }
                }
            }

            list.addAll(mainList);

            if (!ignoreFields.contains("isDone")) {
                list.addAll(doneList);
            }
            if (!ignoreFields.contains("isDelete")) {
                list.addAll(deletedList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Exclui a tarefa especificada pelo título.
     * Move a tarefa da lista principal ou da lista de tarefas iniciadas para a lista de tarefas excluídas.
     * 
     * @param title o título da tarefa a ser excluída.
     */
    public void delete(String title) {
        startedList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                startedList.remove(t);
                deletedList.add(t);
            }
        });
        mainList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                mainList.remove(t);
                deletedList.add(t);
            }
        });
    }

    /**
     * Edita a tarefa especificada pelo título com as informações da nova tarefa fornecida.
     * Remove a tarefa antiga e adiciona a nova tarefa à lista principal.
     * 
     * @param title o título da tarefa a ser editada.
     * @param task a nova tarefa com as informações atualizadas.
     */
    public void edit(String title, Task task) {
        mainList.forEach(t -> {
            if (t.getTitle().equals(title)) {
                mainList.remove(t);
                mainList.add(task);
            }
        });
    }
}
