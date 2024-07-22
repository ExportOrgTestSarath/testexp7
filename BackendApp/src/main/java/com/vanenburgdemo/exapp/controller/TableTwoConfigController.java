package com.vanenburgdemo.exapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.vanenburgdemo.exapp.base.controller.TableTwoConfigBaseController;
import com.vanenburgdemo.exapp.service.ITableTwoConfigService;
import com.vanenburgdemo.exapp.service.TableTwoConfigService;
import com.vanenburgdemo.exapp.model.TableTwoConfig;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/tabletwoconfigs/", produces = "application/json")
public class TableTwoConfigController extends TableTwoConfigBaseController<ITableTwoConfigService<TableTwoConfig>, TableTwoConfig> {
	private static final Logger LOGGER = LoggerFactory.getLogger(TableTwoConfigController.class.getName());
	public TableTwoConfigController(TableTwoConfigService tabletwoconfigService) {
		super(tabletwoconfigService);
	}
}
