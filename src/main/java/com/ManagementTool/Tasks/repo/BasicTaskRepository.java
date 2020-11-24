package com.ManagementTool.Tasks.repo;

import com.ManagementTool.Tasks.dao.BasicTask;
import org.springframework.data.repository.CrudRepository;

public interface BasicTaskRepository extends CrudRepository <BasicTask, Integer> {
}
