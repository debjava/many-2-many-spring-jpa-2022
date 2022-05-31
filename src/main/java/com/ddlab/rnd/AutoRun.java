package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.mapping.Many2ManyBidMapping;

@Component
public class AutoRun {
	
//	@Autowired
//	private Many2ManyUniMapping mapping;
	
	@Autowired
	private Many2ManyBidMapping mapping;
	
	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		mapping.save();
	}

}
