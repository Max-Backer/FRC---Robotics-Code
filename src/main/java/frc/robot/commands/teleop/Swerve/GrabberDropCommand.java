package frc.robot.commands.teleop.Swerve;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.FieldConstants;
import frc.robot.FieldConstants.PickupState;
import frc.robot.subsystems.grabber.RealGrabberSubsystem;

public class GrabberDropCommand extends Command {
    private final RealGrabberSubsystem realGrabSubsystem;
    private PickupState pickupState;

    public GrabberDropCommand(RealGrabberSubsystem realGrabSubsystem, PickupState pickupState) {
        this.realGrabSubsystem = realGrabSubsystem;
        this.pickupState = pickupState;

        addRequirements(realGrabSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        if(pickupState == PickupState.ALAGE || pickupState == PickupState.CORAL) {
            realGrabSubsystem.runMotor(-0.7);
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        realGrabSubsystem.stopMotor();
    }

    }




