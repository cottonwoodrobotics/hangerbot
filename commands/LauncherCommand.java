// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.Constants;
import frc.robot.subsystems.LauncherSubsystem;

/** An example command that uses an example subsystem. */
public class LauncherCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final LauncherSubsystem m_subsystem;
  private final GenericHID m_controller;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public LauncherCommand(LauncherSubsystem subsystem, GenericHID controller) {
    m_subsystem = subsystem;
    m_controller = controller;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double highSpeed = 0;
    double lowSpeed = 0;
    boolean collectButtonPressed = m_controller.getRawButton(Constants.BButton);
    if (collectButtonPressed) {
      highSpeed = 0.3;
      lowSpeed = 0.4;
    } else {
      lowSpeed = 0;
      highSpeed = 0;
    }
    m_subsystem.launch(lowSpeed, highSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
