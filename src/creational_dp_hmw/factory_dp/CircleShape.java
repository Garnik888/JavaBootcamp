package creational_dp_hmw.factory_dp;

import creational_dp_hmw.factory_dp.models.Circle;
import creational_dp_hmw.factory_dp.models.Shape;

public class CircleShape extends ShapeFactory {
    @Override
    public Shape creatShape() {

        return new Circle();
    }
}
