package kr.or.connect;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy:MM:dd:ss"));
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"ko\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <style>\r\n"
				+ "        html, body, div, span, applet, object, iframe,\r\n"
				+ "        h1, h2, h3, h4, h5, h6, p, blockquote, pre,\r\n"
				+ "        a, abbr, acronym, address, big, cite, code,\r\n"
				+ "        del, dfn, em, img, ins, kbd, q, s, samp,\r\n"
				+ "        small, strike, strong, sub, sup, tt, var,\r\n"
				+ "        b, u, i, center,\r\n"
				+ "        dl, dt, dd, ol, ul, li,\r\n"
				+ "        fieldset, form, label, legend,\r\n"
				+ "        table, caption, tbody, tfoot, thead, tr, th, td,\r\n"
				+ "        article, aside, canvas, details, embed, \r\n"
				+ "        figure, figcaption, footer, header, hgroup, \r\n"
				+ "        menu, nav, output, ruby, section, summary,\r\n"
				+ "        time, mark, audio, video {\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "            border: 0;\r\n"
				+ "            font-size: 100%;\r\n"
				+ "            font: inherit;\r\n"
				+ "            vertical-align: baseline;\r\n"
				+ "        }\r\n"
				+ "        /* HTML5 display-role reset for older browsers */\r\n"
				+ "        article, aside, details, figcaption, figure, \r\n"
				+ "        footer, header, hgroup, menu, nav, section {\r\n"
				+ "            display: block;\r\n"
				+ "        }\r\n"
				+ "        body {\r\n"
				+ "            line-height: 1;\r\n"
				+ "        }\r\n"
				+ "        ol, ul {\r\n"
				+ "            list-style: none;\r\n"
				+ "        }\r\n"
				+ "        blockquote, q {\r\n"
				+ "            quotes: none;\r\n"
				+ "        }\r\n"
				+ "        blockquote:before, blockquote:after,\r\n"
				+ "        q:before, q:after {\r\n"
				+ "            content: '';\r\n"
				+ "            content: none;\r\n"
				+ "        }\r\n"
				+ "        table {\r\n"
				+ "            border-collapse: collapse;\r\n"
				+ "            border-spacing: 0;\r\n"
				+ "        }\r\n"
				+ "        .back{\r\n"
				+ "            float : left;\r\n"
				+ "        }\r\n"
				+ "        .wrap {\r\n"
				+ "            display: flex;\r\n"
				+ "			justify-content: center;\r\n"
				+ "			align-items: center;\r\n"
				+ "			min-height: 100vh;\r\n"
				+ "        }\r\n"
				+ "        h1 {\r\n"
				+ "            font-size: 1.7rem;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <a href=\"/aboutme/index.html\" class=\"back\">이전화면</a>\r\n"
				+ "    <div class=\"wrap\">\r\n"
				+ "        <h1>현재 시간은 : " + formatDate +"</h1>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "</body>\r\n"
				+ "</html>");
		
    }
}
