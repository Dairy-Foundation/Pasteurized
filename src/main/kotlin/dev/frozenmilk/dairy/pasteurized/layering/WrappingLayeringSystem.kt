package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

/**
 * this incrementing layering system will wrap around when [next] and [previous] are called on it
 *
 * @see ListLayeringSystem
 */
class WrappingLayeringSystem (private val list: MutableList<PasteurizedGamepad>) : IncrementingLayeringSystem<Int> {
	init {
		list.forEach {
			attachGamepad(it)
		}
	}

	/**
	 * calling next at the last position will cause this layering system to wrap back around to the first position
	 */
	override fun next() {
		layer++
		layer %= list.size
		layer = layer.coerceIn(0 until list.size)
	}

	/**
	 * calling next at the first position will cause this layering system to wrap back around to the last position
	 */
	override fun previous() {
		layer--
		layer %= list.size
		if (layer < 0) layer += list.size
		layer = layer.coerceIn(0 until list.size)
	}

	override var gamepad: PasteurizedGamepad?
		get() { return list.getOrNull(layer) }
		set(value) {
			if (layer in 0 until list.size && value != null) {
				attachGamepad(value)
				list[layer] = value
			}
		}

	override var layer: Int = 0
}