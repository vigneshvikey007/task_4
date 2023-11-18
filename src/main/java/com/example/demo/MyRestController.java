import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    // Example of POST request with JSON payload
    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "Received: " + message;
    }
}

