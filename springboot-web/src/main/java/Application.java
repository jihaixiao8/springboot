import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chujinting on 2016/11/5.
 */

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String home(){
        try {
            String s = "s";
            return "hello";
        } finally {
            System.out.println("hahah");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
