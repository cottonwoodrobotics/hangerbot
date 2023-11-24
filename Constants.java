// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final int left1MotorID = 1;   // }  grouped together
  public static final int left2MotorID = 2;   // }  physically

  public static final int right1MotorID = 3;  // }  grouped together
  public static final int right2MotorID = 4;  // }  physically

  public static final int riseMotorID = 5;

  public static final int XButton = 1;
  public static final int AButton = 2;
  public static final int BButton = 3;
  public static final int YButton = 4;
  
}
