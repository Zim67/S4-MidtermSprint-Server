package sprint.airports;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private List<Airport> airports = new ArrayList<>();

    public List<Airport> findAll() {
        return airports;
    }

    public Airport save(Airport airport) {
        airports.add(airport);
        return airport;
    }

    public Airport findById(Long id) {
        return airports.stream().filter(airport -> airport.getId().equals(id)).findFirst().orElse(null);
    }
}

