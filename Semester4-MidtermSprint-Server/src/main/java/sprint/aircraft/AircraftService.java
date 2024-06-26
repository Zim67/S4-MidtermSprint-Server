package sprint.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private List<Aircraft> aircrafts = new ArrayList<>();

    public List<Aircraft> findAll() {
        return aircrafts;
    }

    public Aircraft save(Aircraft aircraft) {
        aircrafts.add(aircraft);
        return aircraft;
    }

    public Aircraft findById(Long id) {
        return aircrafts.stream().filter(aircraft -> aircraft.getId().equals(id)).findFirst().orElse(null);
    }
}

