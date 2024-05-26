package project_interfaces;

import java.util.List;

public interface TaskList {

	public void done(String title);

	public void start(String title);

	public void stop(String title);

	public void create(Task task);

	public List<Task> list();

	public void delete(String title);

	public void edit(String title, Task task);
}
