// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  CANSparkMax lowLauncherMotor = new CANSparkMax(Constants.lowLauncherMotorID, MotorType.kBrushless);
  CANSparkMax highLauncherMotor = new CANSparkMax(Constants.highLauncherMotorID, MotorType.kBrushless);

  public LauncherSubsystem() {
    lowLauncherMotor.restoreFactoryDefaults();
    lowLauncherMotor.setSmartCurrentLimit(38);
    lowLauncherMotor.setSecondaryCurrentLimit(40);
    highLauncherMotor.restoreFactoryDefaults();
    highLauncherMotor.setSmartCurrentLimit(38);
    highLauncherMotor.setSecondaryCurrentLimit(40);
  }

  public void launch(double lowSpeed, double highSpeed) {
    lowLauncherMotor.set(-lowSpeed);
    highLauncherMotor.set(highSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
