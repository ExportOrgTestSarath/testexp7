package com.vanenburgdemo.exapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.vanenburgdemo.exapp.base.controller.NtabBaseController;
import com.vanenburgdemo.exapp.service.INtabService;
import com.vanenburgdemo.exapp.service.NtabService;
import com.vanenburgdemo.exapp.model.Ntab;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/ntabs/", produces = "application/json")
public class NtabController extends NtabBaseController<INtabService<Ntab>, Ntab> {
	private static final Logger LOGGER = LoggerFactory.getLogger(NtabController.class.getName());
	public NtabController(NtabService ntabService) {
		super(ntabService);
	}
}
