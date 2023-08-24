// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private static CANSparkMax leftMotor1;
  private static CANSparkMax leftMotor2;
  private static CANSparkMax leftMotor3;
  private static CANSparkMax rightMotor1;
  private static CANSparkMax rightMotor2;
  private static CANSparkMax rightMotor3;
  public static MotorControllerGroup leftSide;
  public static MotorControllerGroup rightSide;
  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void initialize() {
    leftMotor1 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor1Port, MotorType.kBrushless);
    leftMotor2 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor2Port, MotorType.kBrushless);
    // leftMotor3 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor3Port, MotorType.kBrushless);
    rightMotor1 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor1Port, MotorType.kBrushless);
    rightMotor2 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor2Port, MotorType.kBrushless);
    // rightMotor3 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor3Port, MotorType.kBrushless);
    leftSide = new MotorControllerGroup(leftMotor1, leftMotor2);
    rightSide = new MotorControllerGroup(rightMotor1, rightMotor2);
  }

  public static void tankDrive(double leftSpeed, double rightSpeed) {
    leftSide.set(leftSpeed);
    rightSide.set(rightSpeed);
  }
}
