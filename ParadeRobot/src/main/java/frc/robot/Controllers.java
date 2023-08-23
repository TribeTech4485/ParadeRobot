// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.XboxController;
// import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
// import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/** Where all of the controller objects are stored. */
public class Controllers {

  // effects unknown if port-bound controllers are not xbox

  /** Generic controller */  

  public static class ControllerBase {
    public CommandXboxController commObject;
    public XboxController object;
    public Trigger A;
    public Trigger B;
    public Trigger X;
    public Trigger Y;
    public Trigger LeftBumper;
    public Trigger RightBumper;
    public Trigger Share;
    public Trigger Options;
    public Trigger LeftTrigger;
    public Trigger RightTrigger;
    public Trigger PovUp;
    public Trigger PovUpLeft;
    public Trigger PovUpRight;
    public Trigger PovDown;
    public Trigger PovDownLeft;
    public Trigger PovDownRight;
    public Trigger PovLeft;
    public Trigger PovRight;
    public Trigger LeftStickPress;
    public Trigger RightStickPress;

    public ControllerBase(int port) {
      this.commObject = new CommandXboxController(port);
      this.object = commObject.getHID();
      this.A = commObject.a();
      this.B = commObject.b();
      this.X = commObject.x();
      this.Y = commObject.y();
      this.LeftBumper = commObject.leftBumper();
      this.RightBumper = commObject.rightBumper();
      this.Share = commObject.start();
      this.Options = commObject.back();
      this.LeftTrigger = commObject.leftTrigger();
      this.RightTrigger = commObject.rightTrigger();
      this.PovUp = commObject.povUp();
      this.PovUpLeft = commObject.povUpLeft();
      this.PovUpRight = commObject.povUpRight();
      this.PovDown = commObject.povDown();
      this.PovDownLeft = commObject.povDownLeft();
      this.PovDownRight = commObject.povDownRight();
      this.PovLeft = commObject.povLeft();
      this.PovRight = commObject.povRight();
      this.LeftStickPress = commObject.leftStick();
      this.RightStickPress = commObject.rightStick();
    }
  }

  // /**
  //  * Xbox controller that will change to lowest numbered port that contains an
  //  * Xbox controller
  //  */
  // static class dynamicXboxClass {
  //   XboxController object = new XboxController(5);
  //   CommandXboxController commObject;
  //   Trigger A;
  //   Trigger B;
  //   Trigger X;
  //   Trigger Y;
  //   Trigger LeftBumper;
  //   Trigger RightBumper;
  //   Trigger LeftStickPress;
  //   Trigger RightStickPress;
  //   Trigger Share;
  //   Trigger Options;
  //   Trigger LeftTrigger;
  //   Trigger RightTrigger;
  //   Trigger PovUp;
  //   Trigger PovUpLeft;
  //   Trigger PovUpRight;
  //   Trigger PovDown;
  //   Trigger PovDownLeft;
  //   Trigger PovDownRight;
  //   Trigger PovLeft;
  //   Trigger PovRight;

  //   void updateController() {
  //     ControllerTracking.updatePortNumbers();
  //     System.out.print(" Assigning dXbox: " + object.getPort());
  //     commObject = new CommandXboxController(object.getPort());
  //     A = commObject.a();
  //     B = commObject.b();
  //     X = commObject.x();
  //     Y = commObject.y();
  //     LeftBumper = commObject.leftBumper();
  //     RightBumper = commObject.rightBumper();
  //     LeftStickPress = commObject.leftStick();
  //     RightStickPress = commObject.rightStick();
  //     Share = commObject.start();
  //     Options = commObject.back();
  //     LeftTrigger = commObject.leftTrigger();
  //     RightTrigger = commObject.rightTrigger();
  //     PovUp = commObject.povUp();
  //     PovUpLeft = commObject.povUpLeft();
  //     PovUpRight = commObject.povUpRight();
  //     PovDown = commObject.povDown();
  //     PovDownLeft = commObject.povDownLeft();
  //     PovDownRight = commObject.povDownRight();
  //     PovLeft = commObject.povLeft();
  //     PovRight = commObject.povRight();
  //   }
  // }

  // /**
  //  * PS4 controller that will change to lowest numbered port that contains a PS4
  //  * controller
  //  */
  // static class dynamicPlaystationClass {
  //   PS4Controller object = new PS4Controller(5);
  //   CommandPS4Controller commObject;
  //   Trigger A;
  //   Trigger B;
  //   Trigger X;
  //   Trigger Y;
  //   Trigger LeftBumper;
  //   Trigger RightBumper;
  //   Trigger LeftStickPress;
  //   Trigger RightStickPress;
  //   Trigger Share;
  //   Trigger Options;
  //   Trigger LeftTrigger;
  //   Trigger RightTrigger;
  //   Trigger PovUp;
  //   Trigger PovUpLeft;
  //   Trigger PovUpRight;
  //   Trigger PovDown;
  //   Trigger PovDownLeft;
  //   Trigger PovDownRight;
  //   Trigger PovLeft;
  //   Trigger PovRight;
  //   Trigger Touchpad;
  //   Trigger PS;

  //   void updateController() {
  //     ControllerTracking.updatePortNumbers();
  //     System.out.print(" Assigning dPlaystations: " + object.getPort());
  //     commObject = new CommandPS4Controller(object.getPort());
  //     A = commObject.cross();
  //     B = commObject.circle();
  //     X = commObject.square();
  //     Y = commObject.triangle();
  //     LeftBumper = commObject.L1();
  //     RightBumper = commObject.R1();
  //     LeftStickPress = commObject.L3();
  //     RightStickPress = commObject.R3();
  //     Share = commObject.share();
  //     Options = commObject.options();
  //     LeftTrigger = commObject.L2();
  //     RightTrigger = commObject.R2();
  //     PovUp = commObject.povUp();
  //     PovUpLeft = commObject.povUpLeft();
  //     PovUpRight = commObject.povUpRight();
  //     PovDown = commObject.povDown();
  //     PovDownLeft = commObject.povDownLeft();
  //     PovDownRight = commObject.povDownRight();
  //     PovLeft = commObject.povLeft();
  //     PovRight = commObject.povRight();
  //     Touchpad = commObject.touchpad();
  //     PS = commObject.PS();
  //   }
  // }

  // /**
  //  * Joystick that will change to lowest numbered port that contains a joystick
  //  * // TODO
  //  */
  // static class dynamicJoystickClass {
  //   Joystick object = new Joystick(5);
  //   CommandJoystick commObject;
  //   Trigger Trigger;
  //   Trigger Two;
  //   Trigger Three;
  //   Trigger Four;
  //   Trigger Five;
  //   Trigger Six;
  //   Trigger Seven;
  //   Trigger Eight;
  //   Trigger Nine;
  //   Trigger Ten;
  //   Trigger Eleven;

  //   void updateController() {
  //     ControllerTracking.updatePortNumbers();
  //     System.out.print(" Assigning dJoystick: " + object.getPort());
  //     commObject = new CommandJoystick(object.getPort());
  //     Trigger = commObject.button(1);
  //     Two = commObject.button(2);
  //     Three = commObject.button(3);
  //     Four = commObject.button(4);
  //     Five = commObject.button(5);
  //     Six = commObject.button(6);
  //     Seven = commObject.button(7);
  //     Eight = commObject.button(8);
  //     Nine = commObject.button(9);
  //     Ten = commObject.button(10);
  //     Eleven = commObject.button(11);
  //   }
  // }

  /*
  public static ControllerBase newController(int Port) {
    ControllerBase Foo = new ControllerBase();
    Foo.commObject = new CommandXboxController(Port);
    Foo.object = Foo.commObject.getHID();
    Foo.A = Foo.commObject.a();
    Foo.B = Foo.commObject.b();
    Foo.X = Foo.commObject.x();
    Foo.Y = Foo.commObject.y();
    Foo.LeftBumper = Foo.commObject.leftBumper();
    Foo.RightBumper = Foo.commObject.rightBumper();
    Foo.LeftStickPress = Foo.commObject.leftStick();
    Foo.RightStickPress = Foo.commObject.rightStick();
    Foo.Share = Foo.commObject.start();
    Foo.Options = Foo.commObject.back();
    Foo.LeftTrigger = Foo.commObject.leftTrigger();
    Foo.RightTrigger = Foo.commObject.rightTrigger();
    Foo.PovUp = Foo.commObject.povUp();
    Foo.PovUpLeft = Foo.commObject.povUpLeft();
    Foo.PovUpRight = Foo.commObject.povUpRight();
    Foo.PovDown = Foo.commObject.povDown();
    Foo.PovDownLeft = Foo.commObject.povDownLeft();
    Foo.PovDownRight = Foo.commObject.povDownRight();
    Foo.PovLeft = Foo.commObject.povLeft();
    Foo.PovRight = Foo.commObject.povRight();
    return Foo;
  }
  */

  public static ControllerBase Zero = new ControllerBase(0);
  public static ControllerBase One = new ControllerBase(1);
  public static ControllerBase Two = new ControllerBase(2);
  public static ControllerBase Three = new ControllerBase(3);
  public static ControllerBase Four = new ControllerBase(4);
  public static ControllerBase Five = new ControllerBase(5);

  public static ControllerBase dynamicXbox = new ControllerBase(5);
  public static ControllerBase dynamicPlaystation = new ControllerBase(5);
  public static ControllerBase dynamicJoystick = new ControllerBase(5);
}