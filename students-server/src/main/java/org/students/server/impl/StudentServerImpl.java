package org.students.server.impl;

import org.students.server.StudentServer;

import com.alibaba.dubbo.config.annotation.Service;

@Service//直接通过注解来依赖注入
public class StudentServerImpl  implements StudentServer{

	public String server(String name) {
		return "server:" +name;
	}

}
