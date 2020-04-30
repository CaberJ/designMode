package cn.caber.abstractfactorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AbstractfactoryPatternApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AbstractfactoryPatternApplication.class, args);
        String farm = run.getEnvironment().getProperty("farm");
        try {
            Class<?> aClass = Class.forName("cn.caber.abstractfactorypattern.impl."+farm + "Farm");
            Farm f = (Farm) aClass.newInstance();
            Animal animal = f.getAnimal();
            Tree tree = f.getTree();
            animal.cry();
            tree.shake();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
