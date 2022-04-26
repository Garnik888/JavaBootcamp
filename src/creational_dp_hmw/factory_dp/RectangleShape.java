package creational_dp_hmw.factory_dp;

import creational_dp_hmw.factory_dp.models.Rectangle;
import creational_dp_hmw.factory_dp.models.Shape;

public class RectangleShape extends ShapeFactory {
    @Override
    public Shape creatShape() {

        return new Rectangle();
    }
}
