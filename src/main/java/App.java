import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean == bean1);

        Cat catBeanFirst = (Cat) applicationContext.getBean("cat");
        Cat catBeanSecond = (Cat) applicationContext.getBean("cat");

        System.out.println(catBeanFirst == catBeanSecond);


    }
}