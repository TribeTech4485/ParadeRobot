// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private static TalonSRX leftMotor1;
  private static TalonSRX leftMotor2;
  // private static CANSparkMax leftMotor3;
  private static TalonSRX rightMotor1;
  private static TalonSRX rightMotor2;
  // private static CANSparkMax rightMotor3;
  // public static MotorControllerGroup leftSide;
  // public static MotorControllerGroup rightSide;
  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void initialize() {
    leftMotor1 = new TalonSRX(2);
    leftMotor2 = new TalonSRX(4);
    // leftMotor3 = new CANSparkMax(Constants.DriveConstants.leftDriveMotor3Port, MotorType.kBrushless);
    rightMotor1 = new TalonSRX(1);
    rightMotor2 = new TalonSRX(3);
    // rightMotor3 = new CANSparkMax(Constants.DriveConstants.rightDriveMotor3Port, MotorType.kBrushless);
  }

  public static void tankDrive(double leftSpeed, double rightSpeed) {
    leftMotor1.set(TalonSRXControlMode.PercentOutput, -leftSpeed);
    leftMotor2.set(TalonSRXControlMode.PercentOutput, -leftSpeed);
    // leftMotor3.set(leftSpeed);
    rightMotor1.set(TalonSRXControlMode.PercentOutput, rightSpeed);
    rightMotor2.set(TalonSRXControlMode.PercentOutput, rightSpeed);
    // rightMotor3.set(rightSpeed);
  }

  public static void setBrakeMode(boolean brake) {
    leftMotor1.setNeutralMode(brake ? NeutralMode.Brake : NeutralMode.Coast);
    leftMotor2.setNeutralMode(brake ? NeutralMode.Brake : NeutralMode.Coast);
    rightMotor1.setNeutralMode(brake ? NeutralMode.Brake : NeutralMode.Coast);
    rightMotor2.setNeutralMode(brake ? NeutralMode.Brake : NeutralMode.Coast);
  }
}
