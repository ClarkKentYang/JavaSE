package com.milan.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4jTest {

	@Test
	public void readXml(){
		try {
			SAXReader reader = new SAXReader();//获取解析器
			Document document = reader.read("src/com/milan/dom4j/web.xml");//得到document文档对象
			
			Element element = document.getRootElement();//获得根元素
			System.out.println(element.getName());
			
			List<Element> childList = element.elements();//获取子元素
			for (Element e : childList) {
				System.out.println(e.getName());
				System.out.println(e.element("servlet-name").getText());
				System.out.println(e.element("servlet-class").getText()); 
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
