package com.iba.utils.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * Druid 监控Servlet	
 * @author 琴兽~
 *
 */
@WebServlet(
		urlPatterns = { "/druid/*" }, 
		initParams = { 
					   @WebInitParam(name = "loginUsername", value = "hxc"),
					   @WebInitParam(name = "loginPassword", value = "sorry") 
					 }
		)
public class DruidStatViewServlet extends StatViewServlet{

	private static final long serialVersionUID = -3012471453989955475L;



}
