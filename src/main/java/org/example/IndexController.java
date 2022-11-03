package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Locale;

@Controller
public class IndexController {

    // localhost:8080/ 으로 들어올때 해당 메소드 실행
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Locale locale, Model model, HttpServletRequest request){
        LocalDateTime localDateTime = LocalDateTime.now();
        model.addAttribute("now",localDateTime); //view에 해당 변수를 보여주고 싶을때

        System.out.println("IndexController");

        // /WEB_INF/views/index.jsp 내부적으로 불러오는 url
        // dispatcher-servlet.xml 에서
        // <beans:property name="prefix" value="/WEB-INF/views/" /> + index + <beans:property name="suffix" value=".jsp" />
        // 의 결과로 만들어진 url임 (index는 현재 public string index() 에서 index 임 대충 컨트롤러 안의 함수명이라고 생각하면 될듯?)
        return "index";

    }
}
