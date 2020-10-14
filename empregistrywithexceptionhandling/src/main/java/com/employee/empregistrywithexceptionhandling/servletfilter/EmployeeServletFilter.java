package com.employee.empregistrywithexceptionhandling.servletfilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class EmployeeServletFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(EmployeeServletFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("EmployeeServletFilter->init() with filter =  "+filterConfig.getFilterName());
    }

    @Override
    public void destroy() {
        logger.debug("EmployeeServletFilter->destroy().");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.debug("EmployeeServletFilter->doFilter() with "+request.getLocalName());
        logger.debug("EmployeeServletFilter->doFilter() with "+request.getLocalAddr());
        chain.doFilter(request,response);
    }
}
