package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import pojo.Wind;
import service.WindService;

@WebServlet("/WindServlet")
public class WindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rowKey=req.getParameter("name");
		WindService service=new WindService();
		List<Wind> list=service.getWind(rowKey);
		String jsonStr=JSON.toJSONString(list);
		resp.getWriter().write(jsonStr);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
