// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private static TalonFX leftMotor1;
  private static TalonFX leftMotor2;
  // private static CANSparkMax leftMotor3;
  private static TalonFX rightMotor1;
  private static TalonFX rightMotor2;
  // private static CANSparkMax rightMotor3;
  // public static MotorControllerGroup leftSide;
  // public static MotorControllerGroup rightSide;
  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void initialize() {
    leftMotor1 = new TalonFX(2);
    leftMotor2 = new TalonFX(4);
    // leftMotor3 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor3Port, MotorType.kBrushless);
    rightMotor1 = new TalonFX(1);
    rightMotor2 = new TalonFX(3);
    // rightMotor3 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor3Port, MotorType.kBrushless);
  }

  public static void tankDrive(double leftSpeed, double rightSpeed) {
    leftMotor1.set(leftSpeed);
    leftMotor2.set(leftSpeed);
    // leftMotor3.set(leftSpeed);
    rightMotor1.set(rightSpeed);
    rightMotor2.set(rightSpeed);
    // rightMotor3.set(rightSpeed);
  }
}
