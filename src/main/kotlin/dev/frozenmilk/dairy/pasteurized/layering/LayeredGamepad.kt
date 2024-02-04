package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.core.util.supplier.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.EnhancedNumberSupplier
import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

class LayeredGamepad(var layeringSystem: LayeringSystem<*>) : PasteurizedGamepad {
	private val err by lazy { IllegalStateException("layering system was unable to supply a gamepad") }
	override var leftStickX: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.leftStickX ?: throw err }
		set(value) { layeringSystem.gamepad?.leftStickX = value }
	override var leftStickY: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.leftStickY ?: throw err }
		set(value) { layeringSystem.gamepad?.leftStickY = value }
	override var rightStickX: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.rightStickX ?: throw err }
		set(value) { layeringSystem.gamepad?.rightStickX = value }
	override var rightStickY: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.rightStickY ?: throw err }
		set(value) { layeringSystem.gamepad?.rightStickY = value }
	override var dpadUp: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.dpadUp ?: throw err }
		set(value) { layeringSystem.gamepad?.dpadUp = value }
	override var dpadDown: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.dpadDown ?: throw err }
		set(value) { layeringSystem.gamepad?.dpadDown = value }
	override var dpadLeft: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.dpadLeft ?: throw err }
		set(value) { layeringSystem.gamepad?.dpadLeft = value }
	override var dpadRight: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.dpadRight ?: throw err }
		set(value) { layeringSystem.gamepad?.dpadRight = value }
	override var a: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.a ?: throw err }
		set(value) { layeringSystem.gamepad?.a = value }
	override var b: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.b ?: throw err }
		set(value) { layeringSystem.gamepad?.b = value }
	override var x: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.x ?: throw err }
		set(value) { layeringSystem.gamepad?.x = value }
	override var y: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.y ?: throw err }
		set(value) { layeringSystem.gamepad?.y = value }
	override var guide: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.guide ?: throw err }
		set(value) { layeringSystem.gamepad?.guide = value }
	override var start: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.start ?: throw err }
		set(value) { layeringSystem.gamepad?.start = value }
	override var back: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.back ?: throw err }
		set(value) { layeringSystem.gamepad?.back = value }
	override var leftBumper: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.leftBumper ?: throw err }
		set(value) { layeringSystem.gamepad?.leftBumper = value }
	override var rightBumper: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.rightBumper ?: throw err }
		set(value) { layeringSystem.gamepad?.rightBumper = value }
	override var leftStickButton: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.leftStickButton ?: throw err }
		set(value) { layeringSystem.gamepad?.leftStickButton = value }
	override var rightStickButton: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.rightStickButton ?: throw err }
		set(value) { layeringSystem.gamepad?.rightStickButton = value }
	override var leftTrigger: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.leftTrigger ?: throw err }
		set(value) { layeringSystem.gamepad?.leftTrigger = value }
	override var rightTrigger: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.rightTrigger ?: throw err }
		set(value) { layeringSystem.gamepad?.rightTrigger = value }
	override var touchpad: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.touchpad ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpad = value }
	override var touchpadFinger1: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.touchpadFinger1 ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger1 = value }
	override var touchpadFinger2: EnhancedBooleanSupplier
		get() { return layeringSystem.gamepad?.touchpadFinger2 ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger2 = value }
	override var touchpadFinger1X: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.touchpadFinger1X ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger1X = value }
	override var touchpadFinger1Y: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.touchpadFinger1Y ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger1Y = value }
	override var touchpadFinger2X: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.touchpadFinger2X ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger2X = value }
	override var touchpadFinger2Y: EnhancedNumberSupplier<Double>
		get() { return layeringSystem.gamepad?.touchpadFinger2Y ?: throw err }
		set(value) { layeringSystem.gamepad?.touchpadFinger2Y = value }
}
