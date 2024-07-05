package com.vanenburgdemo.exapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.vanenburgdemo.exapp.base.service.NtabBaseService;
import com.vanenburgdemo.exapp.model.Ntab;
import com.vanenburgdemo.exapp.service.NtabPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Ntab")
public class NtabService extends NtabBaseService<Ntab> implements INtabService<Ntab>{

		@Autowired
		private  NtabPerimeterImpl  ntabPerimeterImpl;

		public NtabService(ChangelogService changelogService) {
		super(Ntab.class);	
		setChangelogService(changelogService); 
		
	}
	
}