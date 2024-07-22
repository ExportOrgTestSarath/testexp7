package com.vanenburgdemo.exapp.dataexport.extractor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.TableOneConfgAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.TableOneConfgBaseAnalyticalExtractorService;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;

@Component
@Scope(value = "prototype")
public class TableOneConfgAnalyticalExtractorService extends TableOneConfgBaseAnalyticalExtractorService<TableOneConfgAnalyticalBase> {
	private Logger LOGGER = LoggerFactory.getLogger(TableOneConfgAnalyticalExtractorService.class);
	
	public TableOneConfgAnalyticalExtractorService(BaseApplicationConfiguration baseApplicationConfiguration) {
		super(TableOneConfgAnalyticalBase.class, baseApplicationConfiguration);
	}
}
