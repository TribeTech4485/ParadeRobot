// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private static SparkMax leftMotor1;
  private static SparkMax leftMotor2;
  //private static SparkMax leftMotor3;
  private static SparkMax rightMotor1;
  private static SparkMax rightMotor2;
  //private static SparkMax rightMotor3;
  //public static MotorControllerGroup leftSide;
  //public static MotorControllerGroup rightSide;
  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void initialize() {
    
    SparkMaxConfig config = new SparkMaxConfig();

    leftMotor1 = new SparkMax(Constants.DriveConstants.leftDriveMotor1Port, MotorType.kBrushless);
    leftMotor2 = new SparkMax(Constants.DriveConstants.leftDriveMotor2Port, MotorType.kBrushless);
    //leftMotor2.follow(leftMotor1,false);
    config.follow(leftMotor1);
    leftMotor2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    // leftMotor3 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor3Port, MotorType.kBrushless);
    rightMotor1 = new SparkMax(Constants.DriveConstants.rightDriveMotor1Port, MotorType.kBrushless);
    rightMotor2 = new SparkMax(Constants.DriveConstants.rightDriveMotor2Port, MotorType.kBrushless);
    //rightMotor2.follow(rightMotor1,false);
    config.follow(rightMotor1);
    rightMotor2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    // rightMotor3 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor3Port, MotorType.kBrushless);
    //leftSide = new MotorControllerGroup(leftMotor1, leftMotor2);
    //rightSide = new MotorControllerGroup(rightMotor1, rightMotor2);
  }

  public static void tankDrive(double leftSpeed, double rightSpeed) {
    //leftSide.set(leftSpeed);
    //rightSide.set(rightSpeed);
    leftMotor1.set(leftSpeed);
    rightMotor1.set(rightSpeed);
  }
}
