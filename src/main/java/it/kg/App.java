package it.kg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("manga.xml");

        BlueLock bl = (BlueLock) applicationContext.getBean("blue-lock");
        BastardMunchen bm = (BastardMunchen) applicationContext.getBean("bastard-munchen");
        ManshineCity mc = (ManshineCity) applicationContext.getBean("mashine-city");

        System.out.println(bl);
//
//        System.out.println("COUNTRY OF ORIGIN: " + mc.getCountryOfOrigin());
//        System.out.println("NOTABLE MEMBERS: " + Arrays.toString(mc.getMembers()));
    }
}