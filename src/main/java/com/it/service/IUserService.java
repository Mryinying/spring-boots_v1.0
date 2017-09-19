package com.it.service;

import com.it.jooq.generated.tables.pojos.User;

public interface IUserService {
	
	User findById(Integer id);

}
