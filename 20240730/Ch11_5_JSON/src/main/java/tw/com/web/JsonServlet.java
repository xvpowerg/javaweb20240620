package tw.com.web;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testJson")
public class JsonServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String json = "{\r\n"
					+ "     \"firstName\": \"John\",\r\n"
					+ "     \"lastName\": \"Smith\",\r\n"
					+ "     \"sex\": \"male\",\r\n"
					+ "     \"age\": 25,\r\n"
					+ "     \"address\": \r\n"
					+ "     {\r\n"
					+ "         \"streetAddress\": \"21 2nd Street\",\r\n"
					+ "         \"city\": \"New York\",\r\n"
					+ "         \"state\": \"NY\",\r\n"
					+ "         \"postalCode\": \"10021\"\r\n"
					+ "     },\r\n"
					+ "     \"phoneNumber\": \r\n"
					+ "     [\r\n"
					+ "         {\r\n"
					+ "           \"type\": \"home\",\r\n"
					+ "           \"number\": \"212 555-1234\"\r\n"
					+ "         },\r\n"
					+ "         {\r\n"
					+ "           \"type\": \"fax\",\r\n"
					+ "           \"number\": \"646 555-4567\"\r\n"
					+ "         }\r\n"
					+ "     ]\r\n"
					+ " }";
			
			System.out.println(json);
			ObjectMapper objMapper = new ObjectMapper();
			Map map = objMapper.readValue(json, Map.class);
			System.out.println(map);
			String lastName = map.get("lastName").toString();
			System.out.println("lastName:"+lastName);
			Map<String,Object> addrMap =  (Map)map.get("address");
			String city = addrMap.get("city").toString();
			System.out.println(city);
			
			List<Map<String,Object>>  phoneList = (List) map.get("phoneNumber");
			for(Map<String,Object>phoneMap : phoneList) {
				System.out.println(phoneMap);
			}
			
		}
}
