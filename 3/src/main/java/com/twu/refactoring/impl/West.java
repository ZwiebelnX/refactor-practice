package com.twu.refactoring.impl;

import com.twu.refactoring.DirectionFactory;
import com.twu.refactoring.DirectionType;
import com.twu.refactoring.IDirection;

public class West implements IDirection {

    @Override
    public IDirection turnLeft() {
        return DirectionFactory.getDirection(DirectionType.SOUTH);

    }

    @Override
    public IDirection turnRight() {
        return DirectionFactory.getDirection(DirectionType.NORTH);

    }
}
