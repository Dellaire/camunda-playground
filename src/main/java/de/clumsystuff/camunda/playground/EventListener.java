package de.clumsystuff.camunda.playground;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EventListener implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("Got this!");
	}
}
