package com.vanenburgdemo.exapp.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.NtabAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.NtabBaseExportExtractor;
import com.vanenburgdemo.exapp.dataexport.extractor.NtabAnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class NtabExportExtractor extends NtabBaseExportExtractor<NtabAnalyticalExtractorService, NtabAnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(NtabExportExtractor.class);
	
	public NtabExportExtractor(NtabAnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}
