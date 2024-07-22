package com.vanenburgdemo.exapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.vanenburgdemo.exapp.base.service.TableOneConfgBaseService;
import com.vanenburgdemo.exapp.model.TableOneConfg;
import com.vanenburgdemo.exapp.service.TableOneConfgPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("TableOneConfg")
public class TableOneConfgService extends TableOneConfgBaseService<TableOneConfg> implements ITableOneConfgService<TableOneConfg>{

		@Autowired
		private  TableOneConfgPerimeterImpl  tableoneconfgPerimeterImpl;

		public TableOneConfgService(ChangelogService changelogService) {
		super(TableOneConfg.class);	
		setChangelogService(changelogService); 
		
	}
	
}