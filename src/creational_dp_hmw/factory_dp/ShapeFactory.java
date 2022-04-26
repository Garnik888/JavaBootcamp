package creational_dp_hmw.factory_dp;

import creational_dp_hmw.factory_dp.models.Shape;

public abstract class ShapeFactory {

    public void getDrawShape() {

        Shape shape = creatShape();
        shape.draw();
    }

   public abstract Shape creatShape();
}
