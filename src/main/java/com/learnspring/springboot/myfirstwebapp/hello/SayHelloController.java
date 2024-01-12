package com.learnspring.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"say-hello" ==> "Hello! What are you learning today?"

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page </title>");
        sb.append("<body>");
        sb.append("My First Html Page with Body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    //This Approch is difficult?

    //So we will go View Tech called JSP

    //Create JSP with sayHello.jsp
    //"say-hello-jsp" ==> redriect to sayHello.jsp
    //\src\main\resources\META-INF\resources\WEB_INF\jsp/sayHello.jsp
   @RequestMapping("say-hello-jsp")
   public String sayHelloJsp() {
       return "sayHello";
    }

}
