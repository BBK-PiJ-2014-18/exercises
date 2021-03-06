import java.util.concurrent.Executor;

public class SimpleExecutorImpl implements SimpleExecutor { 
	
	private TaskManager manager;
	
	public SimpleExecutorImpl() {
		this.manager = new TaskManager();
		Thread t = new Thread(manager);
		t.start();
	}
	
	@Override
	public void execute(Runnable task) {
		manager.add(task);
	}
		
	public int getMaxWaitingTime() {
		return manager.getMaxWaitingTime();
	}	
	
}

