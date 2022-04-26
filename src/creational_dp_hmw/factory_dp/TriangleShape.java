package creational_dp_hmw.factory_dp;

import creational_dp_hmw.factory_dp.models.Shape;
import creational_dp_hmw.factory_dp.models.Triangle;

public class TriangleShape extends ShapeFactory {
    @Override
    public Shape creatShape() {

        return new Triangle();
    }
}
