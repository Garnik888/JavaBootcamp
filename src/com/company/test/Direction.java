package com.company.test;

public enum Direction {

    EAST(0) {
        public String givDirection() {

            return "East";
        }
    },
    WEST() {
        public String givDirection() {

            return "West";
        }
    },
    NORTH(90) {
        public String givDirection() {

            return "North";
        }
    },
    SOUTH(270) {
        public String givDirection() {

            return "South";
        }
    };

    private int wind;

    Direction() {

    }

    Direction(int wind) {

        this.wind = wind;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }


    public abstract String givDirection();
}
