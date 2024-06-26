package sprint.cities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private List<City> cities = new ArrayList<>();

    public List<City> findAll() {
        return cities;
    }

    public City save(City city) {
        cities.add(city);
        return city;
    }

    public City findById(Long id) {
        return cities.stream().filter(city -> city.getId().equals(id)).findFirst().orElse(null);
    }
}
