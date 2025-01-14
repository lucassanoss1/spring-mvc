package web.servis;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetCarListImpl implements GetCarList {
    private List<Car> cars = new ArrayList<>(List.of(
            new Car("BMW", 123, "germany"),
            new Car("MB", 174, "germany"),
            new Car("AstonMarti", 36, "Italy"),
            new Car("Lada", 100, "Russia"),
            new Car("Cherry", 765, "China")));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
