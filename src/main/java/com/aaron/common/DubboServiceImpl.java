package com.aaron.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aaron.common.api.DubboService;

/**
 * 
 * 
 * @author Aaron
 * @date 2017��7��3��
 * @version 1.0
 * @package_name com.aaron.common
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List getUsers() {
		List list = new ArrayList();
		list.add("AAA");
		list.add("BBB");

		return list;
	}

}
