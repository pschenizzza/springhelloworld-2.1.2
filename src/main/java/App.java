import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean == secondBean);

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        System.out.println(firstCat.getMewing());

        Cat secondCat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondCat.getMewing());
        System.out.println(firstCat == secondCat);

    }
}