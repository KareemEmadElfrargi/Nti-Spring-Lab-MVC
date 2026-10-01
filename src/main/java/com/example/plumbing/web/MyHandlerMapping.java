package com.example.plumbing.web;

import org.springframework.web.servlet.handler.AbstractDetectingUrlHandlerMapping;

/** The only place that knows which URLs map to which controller bean. */
public class MyHandlerMapping extends AbstractDetectingUrlHandlerMapping {

    @Override
    protected String[] determineUrlsForHandler(String controllerID) {
        if ("helloController".equals(controllerID)) {
            return new String[]{"/hello", "/bye"};
        }
        return null;
    }
}
