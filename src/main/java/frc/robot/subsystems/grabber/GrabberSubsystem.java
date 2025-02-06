package frc.robot.subsystems.grabber;

import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.FieldConstants.PickupState;

public interface GrabberSubsystem extends Subsystem {

    boolean isAlgaeDetected();

    void runMotor(double power);

    boolean isCoralDetected();

    void stopMotor();

    void holdMotor();

    PickupState getPickupState();

    void setPickupState(PickupState state);


}
