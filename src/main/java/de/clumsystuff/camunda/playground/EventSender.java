package de.clumsystuff.camunda.playground;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventSender {

	@Autowired
	private RuntimeService runtimeService;

	public void sendEvent() {

		this.runtimeService.startProcessInstanceByKey("test_process");
	}
}
