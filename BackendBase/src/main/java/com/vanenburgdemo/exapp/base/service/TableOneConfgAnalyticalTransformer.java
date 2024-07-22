package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.model.IModelTransformer;
import com.vanenburgdemo.exapp.base.model.TableOneConfgBase;
import com.vanenburgdemo.exapp.base.model.TableOneConfgAnalyticalBase;
import com.vs.rappit.base.util.Configuration;
import java.util.stream.Collectors;

public class TableOneConfgAnalyticalTransformer<T extends TableOneConfgBase, M extends TableOneConfgAnalyticalBase>
		implements IModelTransformer<T, M> {
	private static final String SEPARATOR = "#@$%!*&";
	@Override
	public M writeTo(T model) {
		TableOneConfgAnalyticalBase tableOneConfgAnalyticalBase = new TableOneConfgAnalyticalBase();
			tableOneConfgAnalyticalBase.setValue1(model.getValue1());
	tableOneConfgAnalyticalBase.setValue2(model.getValue2());
		tableOneConfgAnalyticalBase.setSid(model.getSid());
		return (M) tableOneConfgAnalyticalBase;
	}

	@Override
	public Object readFrom(M data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<T> getSourceClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<M> getTargetClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
