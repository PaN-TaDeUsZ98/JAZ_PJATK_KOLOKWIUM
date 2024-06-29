package ppawlina.jaz_s27084_nbp;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NBPService {

    private final  NBPRepository nbpRepository;

    public  NBPService(NBPRepository nbpRepository) {
        this.nbpRepository = nbpRepository;
    }

    public NBP getExchangerate(int id) {
        return null;
    }

}
