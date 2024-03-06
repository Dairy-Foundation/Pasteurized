package dev.frozenmilk.dairy.pasteurized

import com.qualcomm.robotcore.hardware.Gamepad
import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier

class SDKGamepad(gamepad: Gamepad) : PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier> {
	override var leftStickX = EnhancedDoubleSupplier({ gamepad.left_stick_x.toDouble() })
	override var leftStickY = EnhancedDoubleSupplier({ -gamepad.left_stick_y.toDouble() })
	override var rightStickX = EnhancedDoubleSupplier({ gamepad.right_stick_x.toDouble() })
	override var rightStickY = EnhancedDoubleSupplier({ -gamepad.right_stick_y.toDouble() })
	override var dpadUp = EnhancedBooleanSupplier { gamepad.dpad_up }
	override var dpadDown = EnhancedBooleanSupplier { gamepad.dpad_down }
	override var dpadLeft = EnhancedBooleanSupplier { gamepad.dpad_left }
	override var dpadRight = EnhancedBooleanSupplier { gamepad.dpad_right }
	override var a = EnhancedBooleanSupplier { gamepad.a }
	override var b = EnhancedBooleanSupplier { gamepad.b }
	override var x = EnhancedBooleanSupplier { gamepad.x }
	override var y = EnhancedBooleanSupplier { gamepad.y }
	override var guide = EnhancedBooleanSupplier { gamepad.guide }
	override var start = EnhancedBooleanSupplier { gamepad.start }
	override var back = EnhancedBooleanSupplier { gamepad.back }
	override var leftBumper = EnhancedBooleanSupplier { gamepad.left_bumper }
	override var rightBumper = EnhancedBooleanSupplier { gamepad.right_bumper }
	override var leftStickButton = EnhancedBooleanSupplier { gamepad.left_stick_button }
	override var rightStickButton = EnhancedBooleanSupplier { gamepad.right_stick_button }
	override var leftTrigger = EnhancedDoubleSupplier({ gamepad.left_trigger.toDouble() })
	override var rightTrigger = EnhancedDoubleSupplier({ gamepad.right_trigger.toDouble() })
	override var touchpad = EnhancedBooleanSupplier { gamepad.touchpad }
	override var touchpadFinger1 = EnhancedBooleanSupplier { gamepad.touchpad_finger_1 }
	override var touchpadFinger2 = EnhancedBooleanSupplier { gamepad.touchpad_finger_2 }
	override var touchpadFinger1X = EnhancedDoubleSupplier({ gamepad.touchpad_finger_1_x.toDouble() })
	override var touchpadFinger1Y = EnhancedDoubleSupplier({ gamepad.touchpad_finger_1_y.toDouble() })
	override var touchpadFinger2X = EnhancedDoubleSupplier({ gamepad.touchpad_finger_2_x.toDouble() })
	override var touchpadFinger2Y = EnhancedDoubleSupplier({ gamepad.touchpad_finger_2_y.toDouble() })
}