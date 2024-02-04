package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.core.util.supplier.EnhancedNumberSupplier
import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

interface LayeringSystem<T> {
	/**
	 * the gamepad of the current layer
	 */
	var gamepad: PasteurizedGamepad?
	var layer: T

	fun isActive(gamepad: PasteurizedGamepad) = gamepad == this.gamepad

	/**
	 * attaches a gamepad to the layering system, which causes it to go to being at rest when not active in the system, once a gamepad has been attached to a layering system, it cannot be detached
	 */
	fun attachGamepad(gamepad: PasteurizedGamepad) {
		val isActive = { isActive(gamepad) }

		gamepad.leftStickX = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.leftStickX.supplier.get() else 0.0 }, gamepad.leftStickX.modify, gamepad.leftStickX.lowerDeadzone, gamepad.leftStickX.upperDeadzone)
		gamepad.leftStickY = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.leftStickY.supplier.get() else 0.0 }, gamepad.leftStickY.modify, gamepad.leftStickY.lowerDeadzone, gamepad.leftStickY.upperDeadzone)
		gamepad.rightStickX = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.rightStickX.supplier.get() else 0.0 }, gamepad.rightStickX.modify, gamepad.rightStickX.lowerDeadzone, gamepad.rightStickX.upperDeadzone)
		gamepad.rightStickY = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.rightStickY.supplier.get() else 0.0 }, gamepad.rightStickY.modify, gamepad.rightStickY.lowerDeadzone, gamepad.rightStickY.upperDeadzone)

		gamepad.dpadUp = gamepad.dpadUp and isActive
		gamepad.dpadDown = gamepad.dpadDown and isActive
		gamepad.dpadLeft = gamepad.dpadLeft and isActive
		gamepad.dpadRight = gamepad.dpadRight and isActive

		gamepad.a = gamepad.a and isActive
		gamepad.b = gamepad.b and isActive
		gamepad.x = gamepad.x and isActive
		gamepad.y = gamepad.y and isActive

		gamepad.guide = gamepad.guide and isActive
		gamepad.start = gamepad.start and isActive
		gamepad.back = gamepad.back and isActive

		gamepad.leftBumper = gamepad.leftBumper and isActive
		gamepad.rightBumper = gamepad.rightBumper and isActive

		gamepad.leftStickButton = gamepad.leftStickButton and isActive
		gamepad.rightStickButton = gamepad.rightStickButton and isActive

		gamepad.leftTrigger = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.leftTrigger.supplier.get() else 0.0 }, gamepad.leftTrigger.modify, gamepad.leftTrigger.lowerDeadzone, gamepad.leftTrigger.upperDeadzone)
		gamepad.rightTrigger = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.rightTrigger.supplier.get() else 0.0 }, gamepad.rightTrigger.modify, gamepad.rightTrigger.lowerDeadzone, gamepad.rightTrigger.upperDeadzone)

		gamepad.touchpad = gamepad.touchpad and isActive
		gamepad.touchpadFinger1 = gamepad.touchpadFinger1 and isActive
		gamepad.touchpadFinger2 = gamepad.touchpadFinger2 and isActive

		gamepad.touchpadFinger1X = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.touchpadFinger1X.supplier.get() else 0.0 }, gamepad.touchpadFinger1X.modify, gamepad.touchpadFinger1X.lowerDeadzone, gamepad.touchpadFinger1X.upperDeadzone)
		gamepad.touchpadFinger1X = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.touchpadFinger1X.supplier.get() else 0.0 }, gamepad.touchpadFinger1X.modify, gamepad.touchpadFinger1X.lowerDeadzone, gamepad.touchpadFinger1X.upperDeadzone)
		gamepad.touchpadFinger2Y = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.touchpadFinger2Y.supplier.get() else 0.0 }, gamepad.touchpadFinger2Y.modify, gamepad.touchpadFinger2Y.lowerDeadzone, gamepad.touchpadFinger2Y.upperDeadzone)
		gamepad.touchpadFinger2Y = EnhancedNumberSupplier({ if (isActive.invoke()) gamepad.touchpadFinger2Y.supplier.get() else 0.0 }, gamepad.touchpadFinger2Y.modify, gamepad.touchpadFinger2Y.lowerDeadzone, gamepad.touchpadFinger2Y.upperDeadzone)
	}
}

interface IncrementingLayeringSystem<T>: LayeringSystem<T> {
	fun next()
	fun previous()
}
