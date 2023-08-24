// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pnumatics extends SubsystemBase {
  /** Creates a new Pnumatics. */
  public static Compressor compressor;
  public static DoubleSolenoid doubleSolenoid;

  public Pnumatics() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void initialize() {
    compressor = new Compressor(1, PneumaticsModuleType.CTREPCM);
    doubleSolenoid = new DoubleSolenoid(1, PneumaticsModuleType.REVPH, 1, 2);
  }

  public static void solenoidMove(Value position) {
    doubleSolenoid.set(position);
  }
}
