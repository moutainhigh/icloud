package com.icloud.stock.connector.parser;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.icloud.stock.connector.handler.impl.StockCurrentInfoHandler;
import com.icloud.stock.connector.model.StockCurrentInfo;

public class StockTest {
	@Test
	public void parser() throws NoSuchFieldException, SecurityException,
			NoSuchMethodException {
		String url = "http://hq.sinajs.cn/list=sh601006";
		Map<String, String> params = new HashMap<String, String>();
		StockCurrentInfoHandler handler = new StockCurrentInfoHandler(url,
				params);
		StockCurrentInfo httpData = handler.getHttpData();
		System.out.println(httpData);
	}
}