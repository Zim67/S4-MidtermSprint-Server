package sprint.passengers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    public List<Passenger> findAll() {
        return passengers;
    }

    public Passenger save(Passenger passenger) {
        passengers.add(passenger);
        return passenger;
    }

    public Passenger findById(Long id) {
        return passengers.stream().filter(passenger -> passenger.getId().equals(id)).findFirst().orElse(null);
    }
}
