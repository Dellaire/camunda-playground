package de.clumsystuff.camunda.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

	@Autowired
	private EventSender eventSender;
	
	@PostMapping("start")
	public void startProcess()
	{
		this.eventSender.sendEvent();
	}
}
