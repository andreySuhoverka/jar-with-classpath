package sukhoverka.maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.setDisplayName("Yes!");
        System.out.println("Did you say \"No errors on runtime\"? - " + ctx.getDisplayName());
    }
}
