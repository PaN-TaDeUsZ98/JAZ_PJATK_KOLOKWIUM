package ppawlina.jaz_s27084_nbp;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nbp")
public class NBPController {
    private final NBPService nbpService;

    public  NBPController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping
    @Operation(summary = "średni kurs waluty za podanego przedziału czasowego")
    public Object[] getExchangerate(){
        String url = "http://api.nbp.pl/api/exchangerates/rates/{table}/{code}/{startDate}/{endDate}//";
        RestTemplate restTemplate = new RestTemplate();

        Object[] exchangerate = restTemplate.getForObject(url, Object[].class);
        return exchangerate;
    }
}