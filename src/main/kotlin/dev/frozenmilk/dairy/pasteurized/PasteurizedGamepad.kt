package dev.frozenmilk.dairy.pasteurized

import dev.frozenmilk.dairy.core.util.supplier.logical.IEnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.IEnhancedNumericSupplier

@Suppress("INAPPLICABLE_JVM_NAME")
interface PasteurizedGamepad<N: IEnhancedNumericSupplier<Double>, B: IEnhancedBooleanSupplier> {
	/**
	 * left analog stick horizontal axis
	 */
	@get:JvmName("leftStickX")
	@set:JvmName("leftStickX")
	var leftStickX: N

	/**
	 * left analog stick vertical axis
	 */
	@get:JvmName("leftStickY")
	@set:JvmName("leftStickY")
	var leftStickY: N

	/**
	 * right analog stick horizontal axis
	 */
	@get:JvmName("rightStickX")
	@set:JvmName("rightStickX")
	var rightStickX: N

	/**
	 * right analog stick vertical axis
	 */
	@get:JvmName("rightStickY")
	@set:JvmName("rightStickY")
	var rightStickY: N

	/**
	 * dpad up
	 */
	@get:JvmName("dpadUp")
	@set:JvmName("dpadUp")
	var dpadUp: B

	/**
	 * dpad down
	 */
	@get:JvmName("dpadDown")
	@set:JvmName("dpadDown")
	var dpadDown: B

	/**
	 * dpad left
	 */
	@get:JvmName("dpadLeft")
	@set:JvmName("dpadLeft")
	var dpadLeft: B

	/**
	 * dpad right
	 */
	@get:JvmName("dpadRight")
	@set:JvmName("dpadRight")
	var dpadRight: B

	/**
	 * button a
	 */
	@get:JvmName("a")
	@set:JvmName("a")
	var a: B

	/**
	 * button b
	 */
	@get:JvmName("b")
	@set:JvmName("b")
	var b: B

	/**
	 * button x
	 */
	@get:JvmName("x")
	@set:JvmName("x")
	var x: B

	/**
	 * button y
	 */
	@get:JvmName("y")
	@set:JvmName("y")
	var y: B

	/**
	 * button guide - often the large button in the middle of the controller. The OS may
	 * capture this button before it is sent to the app; in which case you'll never
	 * receive it.
	 */
	@get:JvmName("guide")
	@set:JvmName("guide")
	var guide: B

	/**
	 * button start
	 */
	@get:JvmName("start")
	@set:JvmName("start")
	var start: B

	/**
	 * button back
	 */
	@get:JvmName("back")
	@set:JvmName("back")
	var back: B

	/**
	 * button left bumper
	 */
	@get:JvmName("leftBumber")
	@set:JvmName("leftBumber")
	var leftBumper: B

	/**
	 * button right bumper
	 */
	@get:JvmName("rightBumper")
	@set:JvmName("rightBumper")
	var rightBumper: B

	/**
	 * left stick button
	 */
	@get:JvmName("leftStickButton")
	@set:JvmName("leftStickButton")
	var leftStickButton: B

	/**
	 * right stick button
	 */
	@get:JvmName("rightStickButton")
	@set:JvmName("rightStickButton")
	var rightStickButton: B

	/**
	 * left trigger
	 */
	@get:JvmName("leftTrigger")
	@set:JvmName("leftTrigger")
	var leftTrigger: N

	/**
	 * right trigger
	 */
	@get:JvmName("rightTrigger")
	@set:JvmName("rightTrigger")
	var rightTrigger: N

	/**
	 * PS4 Support - Circle
	 */
	@get:JvmName("circle")
	@set:JvmName("circle")
	var circle
		get() = b
		set(value) {
			b = value
		}

	/**
	 * PS4 Support - cross
	 */
	@get:JvmName("cross")
	@set:JvmName("cross")
	var cross
		get() = a
		set(value) {
			a = value
		}

	/**
	 * PS4 Support - triangle
	 */
	@get:JvmName("triangle")
	@set:JvmName("triangle")
	var triangle
		get() = y
		set(value) {
			y = value
		}

	/**
	 * PS4 Support - square
	 */
	@get:JvmName("square")
	@set:JvmName("square")
	var square
		get() = x
		set(value) {
			x = value
		}

	/**
	 * PS4 Support - share
	 */
	@get:JvmName("share")
	@set:JvmName("share")
	var share
		get() = back
		set(value) {
			back = value
		}

	/**
	 * PS4 Support - options
	 */
	@get:JvmName("options")
	@set:JvmName("options")
	var options
		get() = start
		set(value) {
			start = value
		}

	/**
	 * PS4 Support - touchpad
	 */
	@get:JvmName("touchpad")
	@set:JvmName("touchpad")
	var touchpad: B

	@get:JvmName("touchpadFinger1")
	@set:JvmName("touchpadFinger1")
	var touchpadFinger1: B

	@get:JvmName("touchpadFinger2")
	@set:JvmName("touchpadFinger2")
	var touchpadFinger2: B

	@get:JvmName("touchpadFinger1X")
	@set:JvmName("touchpadFinger1X")
	var touchpadFinger1X: N

	@get:JvmName("touchpadFinger1Y")
	@set:JvmName("touchpadFinger1Y")
	var touchpadFinger1Y: N

	@get:JvmName("touchpadFinger2X")
	@set:JvmName("touchpadFinger2X")
	var touchpadFinger2X: N

	@get:JvmName("touchpadFinger2Y")
	@set:JvmName("touchpadFinger2Y")
	var touchpadFinger2Y: N

	/**
	 * PS4 Support - PS Button
	 */
	@get:JvmName("ps")
	@set:JvmName("ps")
	var ps
		get() = guide
		set(value) {
			guide = value
		}
}

