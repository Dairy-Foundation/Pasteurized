package dev.frozenmilk.dairy.pasteurized

import com.qualcomm.robotcore.hardware.Gamepad
import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier

@Suppress("INAPPLICABLE_JVM_NAME")
class SDKGamepad(gamepad: Gamepad) : PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier> {
	@get:JvmName("leftStickX")
	@set:JvmName("leftStickX")
	override var leftStickX = EnhancedDoubleSupplier({ gamepad.left_stick_x.toDouble() })
	@get:JvmName("leftStickY")
	@set:JvmName("leftStickY")
	override var leftStickY = EnhancedDoubleSupplier({ -gamepad.left_stick_y.toDouble() })
	@get:JvmName("rightStickX")
	@set:JvmName("rightStickX")
	override var rightStickX = EnhancedDoubleSupplier({ gamepad.right_stick_x.toDouble() })
	@get:JvmName("rightStickY")
	@set:JvmName("rightStickY")
	override var rightStickY = EnhancedDoubleSupplier({ -gamepad.right_stick_y.toDouble() })
	@get:JvmName("dpadUp")
	@set:JvmName("dpadUp")
	override var dpadUp = EnhancedBooleanSupplier { gamepad.dpad_up }
	@get:JvmName("dpadDown")
	@set:JvmName("dpadDown")
	override var dpadDown = EnhancedBooleanSupplier { gamepad.dpad_down }
	@get:JvmName("dpadLeft")
	@set:JvmName("dpadLeft")
	override var dpadLeft = EnhancedBooleanSupplier { gamepad.dpad_left }
	@get:JvmName("dpadRight")
	@set:JvmName("dpadRight")
	override var dpadRight = EnhancedBooleanSupplier { gamepad.dpad_right }
	@get:JvmName("a")
	@set:JvmName("a")
	override var a = EnhancedBooleanSupplier { gamepad.a }
	@get:JvmName("b")
	@set:JvmName("b")
	override var b = EnhancedBooleanSupplier { gamepad.b }
	@get:JvmName("x")
	@set:JvmName("x")
	override var x = EnhancedBooleanSupplier { gamepad.x }
	@get:JvmName("y")
	@set:JvmName("y")
	override var y = EnhancedBooleanSupplier { gamepad.y }
	@get:JvmName("guide")
	@set:JvmName("guide")
	override var guide = EnhancedBooleanSupplier { gamepad.guide }
	@get:JvmName("start")
	@set:JvmName("start")
	override var start = EnhancedBooleanSupplier { gamepad.start }
	@get:JvmName("back")
	@set:JvmName("back")
	override var back = EnhancedBooleanSupplier { gamepad.back }
	@get:JvmName("leftBumper")
	@set:JvmName("leftBumper")
	override var leftBumper = EnhancedBooleanSupplier { gamepad.left_bumper }
	@get:JvmName("rightBumper")
	@set:JvmName("rightBumper")
	override var rightBumper = EnhancedBooleanSupplier { gamepad.right_bumper }
	@get:JvmName("leftStickButton")
	@set:JvmName("leftStickButton")
	override var leftStickButton = EnhancedBooleanSupplier { gamepad.left_stick_button }
	@get:JvmName("rightStickButton")
	@set:JvmName("rightStickButton")
	override var rightStickButton = EnhancedBooleanSupplier { gamepad.right_stick_button }
	@get:JvmName("leftTrigger")
	@set:JvmName("leftTrigger")
	override var leftTrigger = EnhancedDoubleSupplier({ gamepad.left_trigger.toDouble() })
	@get:JvmName("rightTrigger")
	@set:JvmName("rightTrigger")
	override var rightTrigger = EnhancedDoubleSupplier({ gamepad.right_trigger.toDouble() })
	@get:JvmName("touchpad")
	@set:JvmName("touchpad")
	override var touchpad = EnhancedBooleanSupplier { gamepad.touchpad }
	@get:JvmName("touchpadFinger1")
	@set:JvmName("touchpadFinger1")
	override var touchpadFinger1 = EnhancedBooleanSupplier { gamepad.touchpad_finger_1 }
	@get:JvmName("touchpadFinger2")
	@set:JvmName("touchpadFinger2")
	override var touchpadFinger2 = EnhancedBooleanSupplier { gamepad.touchpad_finger_2 }
	@get:JvmName("touchpadFinger1X")
	@set:JvmName("touchpadFinger1X")
	override var touchpadFinger1X = EnhancedDoubleSupplier({ gamepad.touchpad_finger_1_x.toDouble() })
	@get:JvmName("touchpadFinger1Y")
	@set:JvmName("touchpadFinger1Y")
	override var touchpadFinger1Y = EnhancedDoubleSupplier({ gamepad.touchpad_finger_1_y.toDouble() })
	@get:JvmName("touchpadFinger2X")
	@set:JvmName("touchpadFinger2X")
	override var touchpadFinger2X = EnhancedDoubleSupplier({ gamepad.touchpad_finger_2_x.toDouble() })
	@get:JvmName("touchpadFinger2Y")
	@set:JvmName("touchpadFinger2Y")
	override var touchpadFinger2Y = EnhancedDoubleSupplier({ gamepad.touchpad_finger_2_y.toDouble() })
}