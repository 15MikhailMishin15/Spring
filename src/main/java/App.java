import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat myCat = (Cat) applicationContext.getBean("myCat");
        System.out.println(myCat.getMessage());
        Cat myCat2 = (Cat) applicationContext.getBean("myCat");
        System.out.println(myCat2.getMessage());

        System.out.println(bean==bean2);
        System.out.println(myCat==myCat2);
    }
}