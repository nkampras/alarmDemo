package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class GreetingController {


    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        List<Greeting> greetings = new ArrayList<>();
        Greeting greeting1 = new Greeting();
        Greeting greeting2 = new Greeting();
        Greeting greeting3 = new Greeting();
        Greeting greeting4 = new Greeting();
        Greeting greeting5 = new Greeting();
        Greeting greeting6 = new Greeting();
        Greeting greeting7 = new Greeting();
        Greeting greeting8 = new Greeting();
        Greeting greeting9 = new Greeting();
        Greeting greeting10 = new Greeting();
        Greeting greeting11 = new Greeting();
        Greeting greeting12 = new Greeting();
        
        greeting1.setId(1L);
        greeting1.setContent("C100900");
        greeting2.setId(2L);
        greeting2.setContent("C100913");
        greeting3.setId(3L);
        greeting3.setContent("C105905");
        greeting4.setId(4L);
        greeting4.setContent("C200905");
        greeting5.setId(5L);
        greeting5.setContent("C200900");
        greeting6.setId(6L);
        greeting6.setContent("C201900");
        greeting7.setId(7L);
        greeting7.setContent("C300900");
        greeting8.setId(8L);
        greeting8.setContent("C301900");
        greeting9.setId(9L);
        greeting9.setContent("C600901");
        greeting10.setId(10L);
        greeting10.setContent("C650005");
        greeting11.setId(11L);
        greeting11.setContent("C650010");
        greeting12.setId(12L);
        greeting12.setContent("C650015");
        greetings.add(greeting1);
        greetings.add(greeting2);
        greetings.add(greeting3);
        greetings.add(greeting4);
        greetings.add(greeting5);
        greetings.add(greeting6);
        greetings.add(greeting7);
        greetings.add(greeting8);
        greetings.add(greeting9);
        greetings.add(greeting10);
        greetings.add(greeting11);
        greetings.add(greeting12);
        
        model.addAttribute("greetings", greetings);
        return "greeting";
    }
    

    @PostMapping("/greeting")
    public String greetingSubmit(Greeting greeting) {
        System.out.println("tasos");
        System.out.println(greeting.getContent());
        System.out.println(greeting.getId());
        return "result";
    }

}
