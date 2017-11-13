package com.mzcm.pcs.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.commons.Constants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
public class SecurityInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute(Constants.MZCM_USER) != null || httpServletRequest.getRequestURI().endsWith("login")){
            return true;
        }
        JSONObject jsonResult = new JSONObject();
        jsonResult.put("statusCode", 41);
        jsonResult.put("statusMessage", "error");
        httpServletResponse.getWriter().write(jsonResult.toJSONString());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
