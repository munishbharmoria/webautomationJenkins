package com.ibm.webautomation.pageobjects.common;

import java.io.IOException;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ibm.webautomation.parsers.JSONParser;
import com.ibm.webautomation.uielements.UIElement;

public class BaseCommonImpl {
	
	HashMap<String, UIElement> elementsMap = new HashMap<String, UIElement>();

	public BaseCommonImpl(String name) throws Exception, IOException {

		String path = "elementlocators/" + name + ".json";
		ClassLoader classLoader = Class.forName("com.ibm.webautomation.pageobjects.common.BaseCommonImpl").getClassLoader();
		String pageJsonFile  = classLoader.getResource(path).getFile();
		JSONObject jsonObject = JSONParser.getJSONObjectForAPage(pageJsonFile);
		System.out.println(jsonObject);
		
		 JSONArray arr = jsonObject.getJSONArray("uiElements");
	        for (int i = 0; i < arr.length(); i++)
	        {
	            String elementName = arr.getJSONObject(i).getString("elementName");
	            String byId = arr.getJSONObject(i).getString("by");
	            String locator = arr.getJSONObject(i).getString("locator");

	            UIElement e = new UIElement(elementName, byId, locator);
	            elementsMap.put(elementName, e);
	        }
		
	}

}
