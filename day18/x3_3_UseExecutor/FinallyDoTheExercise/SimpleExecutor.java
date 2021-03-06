import java.util.concurrent.Executor;

/**
 * An executor that returns max wait
 */
 
public interface SimpleExecutor extends Executor {


    /**
     * @return the (theoretical) wait before a new task would start
     */

	public int getMaxWaitingTime();


}
