package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.model.IModelTransformer;
import com.vanenburgdemo.exapp.base.model.TableTwoConfigBase;
import com.vanenburgdemo.exapp.base.model.TableTwoConfigAnalyticalBase;
import com.vs.rappit.base.util.Configuration;
import java.util.stream.Collectors;

public class TableTwoConfigAnalyticalTransformer<T extends TableTwoConfigBase, M extends TableTwoConfigAnalyticalBase>
		implements IModelTransformer<T, M> {
	private static final String SEPARATOR = "#@$%!*&";
	@Override
	public M writeTo(T model) {
		TableTwoConfigAnalyticalBase tableTwoConfigAnalyticalBase = new TableTwoConfigAnalyticalBase();
			tableTwoConfigAnalyticalBase.setEmbed(model.getEmbed());
	tableTwoConfigAnalyticalBase.setTribber(model.getTribber());
		tableTwoConfigAnalyticalBase.setSid(model.getSid());
		return (M) tableTwoConfigAnalyticalBase;
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
