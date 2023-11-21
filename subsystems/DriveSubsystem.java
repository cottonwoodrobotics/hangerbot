package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants.Drive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {
    
  }

  private final MotorController m_left1 = new WPI_VictorSPX(Constants.left1MotorID);
  private final MotorController m_left2 = new WPI_VictorSPX(Constants.left2MotorID);
  private final MotorController m_right1 = new WPI_VictorSPX(Constants.right1MotorID);
  private final MotorController m_right2 = new WPI_VictorSPX(Constants.right2MotorID);
  private final MotorController m_left = new MotorControllerGroup(m_left1, m_left2);
  private final MotorController m_right = new MotorControllerGroup(m_right1, m_right2);


  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_left, m_right);

  public void basicDrive(double xSpeed, double zRotation) {
    m_robotDrive.arcadeDrive(xSpeed, zRotation, false);
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