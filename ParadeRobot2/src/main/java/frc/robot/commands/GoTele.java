package frc.robot.commands;

import java.text.MessageFormat;

import edu.wpi.first.wpilibj.DriverStation;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.Controllers;
import frc.robot.Controllers.*;
import frc.robot.subsystems.DriveTrain;
import java.lang.Math;

public class GoTele extends Command {
  @Override
  public void initialize() {
    System.out.println(MessageFormat.format("**Started {0} ", this.getName()));
  }

  // private double teleLeft = 0;
  // private double teleRight = 0;
  private boolean drivingEnabled = true;
  private double deadzone = -1;
  private double speedMultiplier = 1;
  private int counter = 0;

  /**
   * Identifies active driving controller and activates drivetrain
   */
  public GoTele(boolean drivingEnabled, double driveDeadzone, double topSpeed, Subsystem subsystem) {
    this.drivingEnabled = drivingEnabled;
    this.deadzone = driveDeadzone;
    this.speedMultiplier = topSpeed;
    this.counter = 0;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  @Override
  public void execute() {
    if (counter == 0) {
      if (!drivingEnabled) {
        DriverStation.reportWarning("## Driving is disabled ##", false);
      }
    }
    // double deadzone = 0.0;
    double teleLeft = 0;
    double teleRight = 0;

    ControllerBase driverController = Controllers.Zero;

    // Driving controls
      if (driverController.LeftTrigger.getAsBoolean() == true) {
        teleLeft = (driverController.object.getLeftY() +
            driverController.object.getRightY()) / (-2);
        teleRight = teleLeft;
      } else {
        // teleLeft = driverController.object.getLeftY() * -1;
        // teleRight = driverController.object.getRightY() * -1;
        teleLeft = driverController.object.getRawAxis(0) * -1;
        teleRight = driverController.object.getRawAxis(1) * -1;
        // System.out.println("World" + teleLeft + teleRight);
      }


    teleLeft = procDz(teleLeft, deadzone);
    teleRight = procDz(teleRight, deadzone);

    // depricated slow mode
    if (drivingEnabled) {
      if (driverController.RightBumper.getAsBoolean() ||
          driverController.LeftBumper.getAsBoolean()) {
        DriveTrain.tankDrive(teleLeft / 3, teleRight / 3);
      } else {
        DriveTrain.tankDrive(teleLeft, teleRight);
      }
    }
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  /** Proccess deadzone */
  private double procDz(double input, double deadzone) {
    double a = 1 - deadzone;
    if (Math.abs(input) > deadzone) {
      if (input > 0) {
        input = input - deadzone;
      } else {
        input = input + deadzone;
      }
      input = input * a;
      input = smartSquare(input, Constants.DriveConstants.drivingExponent);
      input = input * speedMultiplier;
    } else {
      input = 0;
    }
    return input;
  }

  private static double smartSquare(double input, int exponent) {
    double output = Math.pow(input, exponent);
    if (Math.signum(input) != Math.signum(output)) {
      output = output * -1;
    }
    return output;
  }
}
