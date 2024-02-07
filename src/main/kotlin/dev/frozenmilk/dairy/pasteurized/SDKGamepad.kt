package dev.frozenmilk.dairy.pasteurized

import com.qualcomm.robotcore.hardware.Gamepad
import dev.frozenmilk.dairy.core.util.supplier.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.EnhancedNumberSupplier

class SDKGamepad(gamepad: Gamepad) : PasteurizedGamepad {
	/**
	 * left analog stick horizontal axis
	 */
	override var leftStickX = EnhancedNumberSupplier { gamepad.left_stick_x.toDouble() }

	/**
	 * left analog stick vertical axis
	 */
	override var leftStickY = EnhancedNumberSupplier { -gamepad.left_stick_y.toDouble() }

	/**
	 * right analog stick horizontal axis
	 */
	override var rightStickX = EnhancedNumberSupplier { gamepad.right_stick_x.toDouble() }

	/**
	 * right analog stick vertical axis
	 */
	override var rightStickY = EnhancedNumberSupplier { -gamepad.right_stick_y.toDouble() }

	/**
	 * dpad up
	 */
	override var dpadUp = EnhancedBooleanSupplier { gamepad.dpad_up }

	/**
	 * dpad down
	 */
	override var dpadDown = EnhancedBooleanSupplier { gamepad.dpad_down }

	/**
	 * dpad left
	 */
	override var dpadLeft = EnhancedBooleanSupplier { gamepad.dpad_left }

	/**
	 * dpad right
	 */
	override var dpadRight = EnhancedBooleanSupplier { gamepad.dpad_right }

	/**
	 * button a
	 */
	override var a = EnhancedBooleanSupplier { gamepad.a }

	/**
	 * button b
	 */
	override var b = EnhancedBooleanSupplier { gamepad.b }

	/**
	 * button x
	 */
	override var x = EnhancedBooleanSupplier { gamepad.x }

	/**
	 * button y
	 */
	override var y = EnhancedBooleanSupplier { gamepad.y }

	/**
	 * button guide - often the large button in the middle of the controller. The OS may
	 * capture this button before it is sent to the app; in which case you'll never
	 * receive it.
	 */
	override var guide = EnhancedBooleanSupplier { gamepad.guide }

	/**
	 * button start
	 */
	override var start = EnhancedBooleanSupplier { gamepad.start }

	/**
	 * button back
	 */
	override var back = EnhancedBooleanSupplier { gamepad.back }

	/**
	 * button left bumper
	 */
	override var leftBumper = EnhancedBooleanSupplier { gamepad.left_bumper }

	/**
	 * button right bumper
	 */
	override var rightBumper = EnhancedBooleanSupplier { gamepad.right_bumper }

	/**
	 * left stick button
	 */
	override var leftStickButton = EnhancedBooleanSupplier { gamepad.left_stick_button }

	/**
	 * right stick button
	 */
	override var rightStickButton = EnhancedBooleanSupplier { gamepad.right_stick_button }

	/**
	 * left trigger
	 */
	override var leftTrigger = EnhancedNumberSupplier { gamepad.left_trigger.toDouble() }

	/**
	 * right trigger
	 */
	override var rightTrigger = EnhancedNumberSupplier { gamepad.right_trigger.toDouble() }

	/**
	 * PS4 Support - Circle
	 */
	override var circle
		get() = b
		set(value) {
			b = value
		}

	/**
	 * PS4 Support - cross
	 */
	override var cross
		get() = a
		set(value) {
			a = value
		}

	/**
	 * PS4 Support - triangle
	 */
	override var triangle
		get() = y
		set(value) {
			y = value
		}

	/**
	 * PS4 Support - square
	 */
	override var square
		get() = x
		set(value) {
			x = value
		}

	/**
	 * PS4 Support - share
	 */
	override var share
		get() = back
		set(value) {
			back = value
		}

	/**
	 * PS4 Support - options
	 */
	override var options
		get() = start
		set(value) {
			start = value
		}

	/**
	 * PS4 Support - touchpad
	 */
	override var touchpad = EnhancedBooleanSupplier { gamepad.touchpad }

	override var touchpadFinger1 = EnhancedBooleanSupplier { gamepad.touchpad_finger_1 }

	override var touchpadFinger2 = EnhancedBooleanSupplier { gamepad.touchpad_finger_2 }

	override var touchpadFinger1X = EnhancedNumberSupplier { gamepad.touchpad_finger_1_x.toDouble() }

	override var touchpadFinger1Y = EnhancedNumberSupplier { gamepad.touchpad_finger_1_y.toDouble() }

	override var touchpadFinger2X = EnhancedNumberSupplier { gamepad.touchpad_finger_2_x.toDouble() }

	override var touchpadFinger2Y = EnhancedNumberSupplier { gamepad.touchpad_finger_2_y.toDouble() }

	/**
	 * PS4 Support - PS Button
	 */
	override var ps
		get() = guide
		set(value) {
			guide = value
		}
}