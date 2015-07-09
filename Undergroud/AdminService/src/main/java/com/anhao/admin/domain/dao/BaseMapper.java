package com.anhao.admin.domain.dao;

import java.io.Serializable;

public interface BaseMapper<T, PK extends Serializable> {

	public T get(PK id);

}
