package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class Shapes {

    private static final double CIRCLE = 2*Math.PI;
    public static ComplexCommand circle(Job2dDriver driver, int x, int y, int radius, int resolution) {
        ComplexCommand complexCommand = new ComplexCommand();

        return complexCommand;
    }

    public static ComplexCommand rectangle(Job2dDriver driver, int x, int y, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.add(new SetPositionCommand(x, y, driver));

        complexCommand.add(new OperateToCommand(x + width, y, driver));
        complexCommand.add(new OperateToCommand(x + width, y + height, driver));
        complexCommand.add(new OperateToCommand(x, y + height, driver));
        complexCommand.add(new OperateToCommand(x, y, driver));
        return complexCommand;
    }
}
