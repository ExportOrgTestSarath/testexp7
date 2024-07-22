package com.vanenburgdemo.exapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.vanenburgdemo.exapp.base.service.TableTwoConfigBaseService;
import com.vanenburgdemo.exapp.model.TableTwoConfig;
import com.vanenburgdemo.exapp.service.TableTwoConfigPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("TableTwoConfig")
public class TableTwoConfigService extends TableTwoConfigBaseService<TableTwoConfig> implements ITableTwoConfigService<TableTwoConfig>{

		@Autowired
		private  TableTwoConfigPerimeterImpl  tabletwoconfigPerimeterImpl;

		public TableTwoConfigService(ChangelogService changelogService) {
		super(TableTwoConfig.class);	
		setChangelogService(changelogService); 
		
	}
	
}