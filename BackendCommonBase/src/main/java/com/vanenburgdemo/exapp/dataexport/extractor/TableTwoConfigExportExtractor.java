package com.vanenburgdemo.exapp.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.TableTwoConfigAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.TableTwoConfigBaseExportExtractor;
import com.vanenburgdemo.exapp.dataexport.extractor.TableTwoConfigAnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class TableTwoConfigExportExtractor extends TableTwoConfigBaseExportExtractor<TableTwoConfigAnalyticalExtractorService, TableTwoConfigAnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(TableTwoConfigExportExtractor.class);
	
	public TableTwoConfigExportExtractor(TableTwoConfigAnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}
