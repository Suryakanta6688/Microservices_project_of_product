package lab.lmsassignment.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	@GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return  "<center><h2> sum of a&b is " + (a+b) +  "!!!!</h2></center";
    }

    @GetMapping("/subtract")
    public String subtraction(@RequestParam int a, @RequestParam int b) {
        return "<center><h2> substraction of a-b is " + (a-b) +  "!!!!</h2></center";
    }

    @GetMapping("/multi")
    public String multiplication(@RequestParam int a, @RequestParam int b) {
        return "<center><h2> multiplication of a&b is " + (a*b) +  "!!!!</h2></center";
    }
    @GetMapping("/div")
    public String divide(@RequestParam int a, @RequestParam int b) throws Exception {
        if (a == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return "<center><h2> Quotient is " + (a/b) +  "!!!!</h2></center"; 
        
    }
    
}
