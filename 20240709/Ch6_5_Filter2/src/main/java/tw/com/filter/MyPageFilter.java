package tw.com.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/mypage/*")
public class MyPageFilter implements Filter{
	@Override
	public void doFilter(ServletRequest req, ServletResponse respon, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		respon.setContentType("text/html;charset=utf-8");
		arg2.doFilter(req, respon);
	}
}
