package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
	
	private List<Tarefa> listTask;
	
	public ListTask() {
		this.listTask = new ArrayList<>();
	}
	
	public void addTask(String description) {
		listTask.add(new Tarefa(description));
	}
	
	public void removeTask(String description) {
		List<Tarefa> tasksForRemove = new ArrayList<Tarefa>();
		for( Tarefa t : listTask) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				tasksForRemove.add(t);
			}
		}
		listTask.removeAll(tasksForRemove);
	}
	
	public int totalTasks() {
		return listTask.size();
	}
	
	public void descriptionTasks() {
		System.out.println(listTask);
	}
	
	public static void main(String[] arg) {
		ListTask listTask = new ListTask();
		
		System.out.println("O número total de tarefas: " + listTask.totalTasks());
		
		listTask.addTask("Tarefa 1");
		System.out.println("O número total de tarefas: " + listTask.totalTasks());

		listTask.addTask("Tarefa 2");
		System.out.println("O número total de tarefas: " + listTask.totalTasks());
		
		listTask.removeTask("Tarefa 1");
		System.out.println("O número total de tarefas: " + listTask.totalTasks());

		
	listTask.descriptionTasks();
	}
}
