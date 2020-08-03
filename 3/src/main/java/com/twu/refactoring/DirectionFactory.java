package com.twu.refactoring;

import com.twu.refactoring.impl.East;
import com.twu.refactoring.impl.North;
import com.twu.refactoring.impl.South;
import com.twu.refactoring.impl.West;

public class DirectionFactory {

    public static IDirection getDirection(DirectionType directionType) {
        switch (directionType) {
            case EAST:
                return new East();
            case WEST:
                return new West();
            case NORTH:
                return new North();
            case SOUTH:
            default:
                throw new IllegalArgumentException();
        }
    }

}
