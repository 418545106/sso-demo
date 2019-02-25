package com.yueqi.sso.server;

import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther: zpd
 * @Date: 2019/2/25 0025 14:56
 * @Description:
 */
@RestController
public class AuthenticationController {

    /**
     * 重定向的类
     */
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /**
     * when need role authentication
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/authentication/require")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public void requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
        redirectStrategy.sendRedirect(request,response,"/signIn.html");
    }
}
