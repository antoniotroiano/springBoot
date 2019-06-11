package com.valtech.velocity;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class HelloWorld {

    public static void main(String[] args) {

        VelocityEngine velocityEngine = new VelocityEngine();

        velocityEngine.init();

        Template template = velocityEngine.getTemplate("src/main/resources/templates/helloworld.html");

        VelocityContext velocityContext = new VelocityContext();

        StringWriter writer = new StringWriter();

        template.merge(velocityContext, writer);

        System.out.println(writer);
    }
}
