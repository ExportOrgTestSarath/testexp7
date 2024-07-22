package com.vanenburgdemo.exapp.dataexport.extractor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.TableTwoConfigAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.TableTwoConfigBaseAnalyticalExtractorService;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;

@Component
@Scope(value = "prototype")
public class TableTwoConfigAnalyticalExtractorService extends TableTwoConfigBaseAnalyticalExtractorService<TableTwoConfigAnalyticalBase> {
	private Logger LOGGER = LoggerFactory.getLogger(TableTwoConfigAnalyticalExtractorService.class);
	
	public TableTwoConfigAnalyticalExtractorService(BaseApplicationConfiguration baseApplicationConfiguration) {
		super(TableTwoConfigAnalyticalBase.class, baseApplicationConfiguration);
	}
}
