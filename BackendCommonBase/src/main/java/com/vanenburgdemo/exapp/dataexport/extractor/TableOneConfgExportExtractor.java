package com.vanenburgdemo.exapp.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.TableOneConfgAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.TableOneConfgBaseExportExtractor;
import com.vanenburgdemo.exapp.dataexport.extractor.TableOneConfgAnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class TableOneConfgExportExtractor extends TableOneConfgBaseExportExtractor<TableOneConfgAnalyticalExtractorService, TableOneConfgAnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(TableOneConfgExportExtractor.class);
	
	public TableOneConfgExportExtractor(TableOneConfgAnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}
