package web.servis;

import Model.Car;
import java.util.List;

public interface GetCarList {
    List<Car> getCars(Integer count);
}
