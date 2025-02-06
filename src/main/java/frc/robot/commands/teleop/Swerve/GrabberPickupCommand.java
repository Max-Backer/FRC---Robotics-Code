package frc.robot.commands.teleop.Swerve;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.FieldConstants;
import frc.robot.FieldConstants.PickupState;
import frc.robot.subsystems.grabber.RealGrabberSubsystem;

public class GrabberPickupCommand extends Command { 
    private final RealGrabberSubsystem realGrabSubsystem;

    public GrabberPickupCommand(RealGrabberSubsystem realGrabSubsystem) {
        this.realGrabSubsystem = realGrabSubsystem;

        addRequirements(realGrabSubsystem);
    }

    @Override
    public void initialize() {
        realGrabSubsystem.runMotor(1);
    
    }

    @Override
    public void execute() {
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




