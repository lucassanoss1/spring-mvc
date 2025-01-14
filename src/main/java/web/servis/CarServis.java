package web.servis;


import web.model.Car;

import java.util.List;

public interface CarServis {
    List<Car> getCarsByCount(Integer count);
}
