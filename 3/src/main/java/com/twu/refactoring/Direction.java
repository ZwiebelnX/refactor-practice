package com.twu.refactoring;

public class Direction {
    private final IDirection direction;

    public Direction(char direction) {
        switch (direction) {
            case 'N':
                this.direction = DirectionFactory.getDirection(DirectionType.NORTH);
                break;
            case 'S':
                this.direction = DirectionFactory.getDirection(DirectionType.SOUTH);
                break;
            case 'E':
                this.direction = DirectionFactory.getDirection(DirectionType.EAST);
                break;
            case 'W':
                this.direction = DirectionFactory.getDirection(DirectionType.WEST);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public IDirection turnRight() {
        return direction.turnRight();
    }

    public IDirection turnLeft() {
        return direction.turnLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        if (direction != direction1.direction) return false;

        return true;
    }


    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }
}
