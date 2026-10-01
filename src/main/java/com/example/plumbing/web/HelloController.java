package com.example.plumbing.web;

import com.example.plumbing.service.GreetingService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/** Knows nothing about URLs (MyHandlerMapping) or view technology (viewResolver). */
public class HelloController extends AbstractController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) {
        // "hello" is a logical view name; the view resolver adds prefix and suffix.
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Here the message");
        mv.addObject("name", greetingService.greet("Hamada"));
        return mv;
    }
}
