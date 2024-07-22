package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.logic.ICRUDOperation;
import com.vanenburgdemo.exapp.base.model.TableTwoConfigBase;


public interface ITableTwoConfigBaseService<T extends TableTwoConfigBase> extends ICRUDOperation<T>{
	public T getByEmbed(String embed);

	
}