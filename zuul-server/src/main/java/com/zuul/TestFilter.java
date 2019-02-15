package com.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ouyang
 * @date 2019/2/13 17:23
 */
public class TestFilter extends ZuulFilter {
    /**
     * 定义filter的类型，有pre 路由前、route 路由时、post 路由后、error 异常 四种
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 优先级，数值越大优先级越低
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否需要过滤（执行run）
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("请求方式："+request.getMethod()+" 请求地址:"+request.getRequestURI());
        return null;
    }
}
