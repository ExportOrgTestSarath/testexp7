package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.logic.ICRUDOperation;
import com.vanenburgdemo.exapp.base.model.TableOneConfgBase;


public interface ITableOneConfgBaseService<T extends TableOneConfgBase> extends ICRUDOperation<T>{
	public T getByValue1(String value1);

	
}