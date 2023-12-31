// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Timer;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import frc.robot.Constants;

public class RiseSubsystem extends SubsystemBase {
  public RiseSubsystem() {}

  private final Timer m_timer = new Timer();
  private final MotorController m_riseMotor = new WPI_VictorSPX(Constants.riseMotorID);

  public void riseTower(double speed) {
    m_timer.reset();
    m_riseMotor.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if (m_timer.get() > 2) {
        m_riseMotor.stopMotor();
    }
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
