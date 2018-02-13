package lovotech;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LovotechController {

	 private static final String template = "Bonjour, bienvenue %s chez Lovotech !";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/lovotech")
	    public Lovotech lovotech(@RequestParam(value="name", defaultValue="utilisateur") String name) {
	        return new Lovotech(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
	
}
