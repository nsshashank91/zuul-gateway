package org.mydemo;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "error-filter";
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
		System.out.println("Using Error Filter");
		return null;
	}
}
