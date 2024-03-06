package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.logical.IEnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.IEnhancedNumericSupplier
import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

interface LayeringSystem<T> {
	/**
	 * the gamepad of the current layer
	 */
	var gamepad: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?
	var layer: T

	fun isActive(gamepad: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>) = gamepad == this.gamepad

	/**
	 * attaches a gamepad to the layering system, which causes it to go to being at rest when not active in the system, once a gamepad has been attached to a layering system, it cannot be detached
	 */
	fun attachGamepad(gamepad: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>) {
		val isActiveBoolean = { isActive(gamepad) }
		val isActiveNumber = { supplier: IEnhancedNumericSupplier<Double> ->
			{
				if (isActiveBoolean()) supplier.position
				else 0.0
			}
		}

		gamepad.leftStickX = EnhancedDoubleSupplier(isActiveNumber(gamepad.leftStickX), gamepad.leftStickX.modifier)
		gamepad.leftStickY = EnhancedDoubleSupplier(isActiveNumber(gamepad.leftStickY), gamepad.leftStickY.modifier)
		gamepad.rightStickX = EnhancedDoubleSupplier(isActiveNumber(gamepad.rightStickX), gamepad.rightStickX.modifier)
		gamepad.rightStickY = EnhancedDoubleSupplier(isActiveNumber(gamepad.rightStickY), gamepad.rightStickY.modifier)

		gamepad.dpadUp = gamepad.dpadUp and isActiveBoolean
		gamepad.dpadDown = gamepad.dpadDown and isActiveBoolean
		gamepad.dpadLeft = gamepad.dpadLeft and isActiveBoolean
		gamepad.dpadRight = gamepad.dpadRight and isActiveBoolean

		gamepad.a = gamepad.a and isActiveBoolean
		gamepad.b = gamepad.b and isActiveBoolean
		gamepad.x = gamepad.x and isActiveBoolean
		gamepad.y = gamepad.y and isActiveBoolean

		gamepad.guide = gamepad.guide and isActiveBoolean
		gamepad.start = gamepad.start and isActiveBoolean
		gamepad.back = gamepad.back and isActiveBoolean

		gamepad.leftBumper = gamepad.leftBumper and isActiveBoolean
		gamepad.rightBumper = gamepad.rightBumper and isActiveBoolean

		gamepad.leftStickButton = gamepad.leftStickButton and isActiveBoolean
		gamepad.rightStickButton = gamepad.rightStickButton and isActiveBoolean

		gamepad.leftTrigger = EnhancedDoubleSupplier(isActiveNumber(gamepad.leftTrigger), gamepad.leftTrigger.modifier)
		gamepad.rightTrigger = EnhancedDoubleSupplier(isActiveNumber(gamepad.rightTrigger), gamepad.rightTrigger.modifier)

		gamepad.touchpad = gamepad.touchpad and isActiveBoolean
		gamepad.touchpadFinger1 = gamepad.touchpadFinger1 and isActiveBoolean
		gamepad.touchpadFinger2 = gamepad.touchpadFinger2 and isActiveBoolean

		gamepad.touchpadFinger1X = EnhancedDoubleSupplier(isActiveNumber(gamepad.touchpadFinger1X), gamepad.touchpadFinger1X.modifier)
		gamepad.touchpadFinger1Y = EnhancedDoubleSupplier(isActiveNumber(gamepad.touchpadFinger1Y), gamepad.touchpadFinger1Y.modifier)
		gamepad.touchpadFinger2X = EnhancedDoubleSupplier(isActiveNumber(gamepad.touchpadFinger2X), gamepad.touchpadFinger2X.modifier)
		gamepad.touchpadFinger2Y = EnhancedDoubleSupplier(isActiveNumber(gamepad.touchpadFinger2Y), gamepad.touchpadFinger2Y.modifier)
	}
}

interface IncrementingLayeringSystem<T>: LayeringSystem<T> {
	fun next()
	fun previous()
}
