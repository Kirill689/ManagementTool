package com.ManagementTool.Tasks.repo;

import com.ManagementTool.Tasks.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer> {


}
