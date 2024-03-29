package org.mydemo;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "pre";
	}
	@Override
	public int filterOrder() {
		return 0;
	}
	@Override
	public boolean shouldFilter() {
		return true;
	}
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println("Request method: "+request.getMethod()+
				" Request URL: "+request.getRequestURI().toString());
		return null;
	}
}
