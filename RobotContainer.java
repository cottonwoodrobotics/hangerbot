// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.CollectorCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.RiseCommand;
import frc.robot.commands.LauncherCommand;
import frc.robot.subsystems.CollectorSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.RiseSubsystem;
import frc.robot.subsystems.LauncherSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandGenericHID;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // Controllers
  private final GenericHID m_driverController =
    new GenericHID(OperatorConstants.kDriverControllerPort);

  // The robot's subsystems and commands are defined here...
  
  // Subsystems
  private final DriveSubsystem m_DriveSubsystem = new DriveSubsystem();
  private final RiseSubsystem m_RiseSubsystem = new RiseSubsystem();
  private final CollectorSubsystem m_CollectorSubsystem = new CollectorSubsystem();
  private final LauncherSubsystem m_LauncherSubsystem = new LauncherSubsystem();
  // Commands
  private final DriveCommand m_DriveCommand = new DriveCommand(m_DriveSubsystem, m_driverController);
  private final RiseCommand m_RiseCommand = new RiseCommand(m_RiseSubsystem, m_driverController);
  private final CollectorCommand m_CollectorCommand = new CollectorCommand(m_CollectorSubsystem, m_driverController);
  private final LauncherCommand m_LauncherCommand = new LauncherCommand(m_LauncherSubsystem, m_driverController);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    m_RiseSubsystem.setDefaultCommand(m_RiseCommand);
    m_DriveSubsystem.setDefaultCommand(m_DriveCommand);
    m_CollectorSubsystem.setDefaultCommand(m_CollectorCommand);
    m_LauncherSubsystem.setDefaultCommand(m_LauncherCommand);
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    // new Trigger(m_exampleSubsystem::exampleCondition)
    //     .onTrue(new ExampleCommand(m_exampleSubsystem));

    // // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // // cancelling on release.
    // m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(null);
  }
}
