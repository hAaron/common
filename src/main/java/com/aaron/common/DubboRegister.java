package com.aaron.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 * @author Aaron
 * @date 2017��7��3��
 * @version 1.0
 * @package_name com.aaron.common
 */
public class DubboRegister {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.in.read(); // Ϊ��֤����һֱ���š������������Ķ�����ģ��
	}
}
