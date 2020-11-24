package com.ManagementTool.Tasks.dao;

import javax.persistence.Entity;
import java.util.Collection;

@Entity
public class Task extends BasicTask  {

    private String group;

    private long ownerId;

    private Collection <BasicTask> subTaskList;
}
