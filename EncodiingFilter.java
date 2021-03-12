package com.webjjang.util.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodiingFilter
 */
@WebFilter("/*")
public class EncodiingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EncodiingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//전처리- 한글처리 
		System.out.println("EncodingFilter.doFilter()-한글처리");
		request.setCharacterEncoding("utf-8");
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response); //실제적으로 실행하고 싶은 곳을 호출해주는 처리문 
		//여기에 작성하면 후처리 
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
