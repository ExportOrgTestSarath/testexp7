package com.vanenburgdemo.exapp.dataexport.extractor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.NtabAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.NtabBaseAnalyticalExtractorService;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;

@Component
@Scope(value = "prototype")
public class NtabAnalyticalExtractorService extends NtabBaseAnalyticalExtractorService<NtabAnalyticalBase> {
	private Logger LOGGER = LoggerFactory.getLogger(NtabAnalyticalExtractorService.class);
	
	public NtabAnalyticalExtractorService(BaseApplicationConfiguration baseApplicationConfiguration) {
		super(NtabAnalyticalBase.class, baseApplicationConfiguration);
	}
}
