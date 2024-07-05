package com.vanenburgdemo.exapp.dataexport.finalizer;

import org.springframework.stereotype.Service;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.dataexport.finalizer.NtabBaseExportFinalizer;
import com.vanenburgdemo.exapp.service.ApplicationUserService;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class NtabExportFinalizer extends NtabBaseExportFinalizer {

	private Logger LOGGER = LoggerFactory.getLogger(NtabExportFinalizer.class);
	
	public NtabExportFinalizer(ApplicationUserService applicationUserService) {
		super(applicationUserService, true);
	}

}
