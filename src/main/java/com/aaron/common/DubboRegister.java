package com.aaron.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 * @author Aaron
 * @date 2017年7月3日
 * @version 1.0
 * @package_name com.aaron.common
 */
public class DubboRegister {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.in.read(); // 为保证服务一直开着。利用输入流的堵塞来模拟
	}
}
