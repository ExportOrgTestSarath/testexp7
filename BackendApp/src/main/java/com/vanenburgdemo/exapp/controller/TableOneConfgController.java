package com.vanenburgdemo.exapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.vanenburgdemo.exapp.base.controller.TableOneConfgBaseController;
import com.vanenburgdemo.exapp.service.ITableOneConfgService;
import com.vanenburgdemo.exapp.service.TableOneConfgService;
import com.vanenburgdemo.exapp.model.TableOneConfg;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/tableoneconfgs/", produces = "application/json")
public class TableOneConfgController extends TableOneConfgBaseController<ITableOneConfgService<TableOneConfg>, TableOneConfg> {
	private static final Logger LOGGER = LoggerFactory.getLogger(TableOneConfgController.class.getName());
	public TableOneConfgController(TableOneConfgService tableoneconfgService) {
		super(tableoneconfgService);
	}
}
