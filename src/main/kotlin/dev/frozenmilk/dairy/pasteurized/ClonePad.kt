package dev.frozenmilk.dairy.pasteurized

class ClonePad(pasteurizedGamepad: PasteurizedGamepad) : PasteurizedGamepad {
	override var leftStickX = pasteurizedGamepad.leftStickX
	override var leftStickY = pasteurizedGamepad.leftStickY
	override var rightStickX = pasteurizedGamepad.rightStickX
	override var rightStickY = pasteurizedGamepad.rightStickY
	override var dpadUp = pasteurizedGamepad.dpadUp
	override var dpadDown = pasteurizedGamepad.dpadDown
	override var dpadLeft = pasteurizedGamepad.dpadLeft
	override var dpadRight = pasteurizedGamepad.dpadRight
	override var a = pasteurizedGamepad.a
	override var b = pasteurizedGamepad.b
	override var x = pasteurizedGamepad.x
	override var y = pasteurizedGamepad.y
	override var guide = pasteurizedGamepad.guide
	override var start = pasteurizedGamepad.start
	override var back = pasteurizedGamepad.back
	override var leftBumper = pasteurizedGamepad.leftBumper
	override var rightBumper = pasteurizedGamepad.rightBumper
	override var leftStickButton = pasteurizedGamepad.leftStickButton
	override var rightStickButton = pasteurizedGamepad.rightStickButton
	override var leftTrigger = pasteurizedGamepad.leftTrigger
	override var rightTrigger = pasteurizedGamepad.rightTrigger
	override var touchpad = pasteurizedGamepad.touchpad
	override var touchpadFinger1 = pasteurizedGamepad.touchpadFinger1
	override var touchpadFinger2 = pasteurizedGamepad.touchpadFinger2
	override var touchpadFinger1X = pasteurizedGamepad.touchpadFinger1X
	override var touchpadFinger1Y = pasteurizedGamepad.touchpadFinger1Y
	override var touchpadFinger2X = pasteurizedGamepad.touchpadFinger2X
	override var touchpadFinger2Y = pasteurizedGamepad.touchpadFinger2Y
}
