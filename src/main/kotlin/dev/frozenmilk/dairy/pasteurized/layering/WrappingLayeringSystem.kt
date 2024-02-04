package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

/**
 * this incrementing layering system will wrap around when [next] and [previous] are called on it
 *
 * @see ListLayeringSystem
 */
class WrappingLayeringSystem (private val list: MutableList<PasteurizedGamepad>) : IncrementingLayeringSystem<Int>, MutableList<PasteurizedGamepad> by list {
	init {
		forEach {
			attachGamepad(it)
		}
	}

	override fun add(element: PasteurizedGamepad): Boolean {
		attachGamepad(element)
		return list.add(element)
	}

	override fun addAll(elements: Collection<PasteurizedGamepad>): Boolean {
		elements.forEach { attachGamepad(it) }
		return list.addAll(elements)
	}

	override fun addAll(index: Int, elements: Collection<PasteurizedGamepad>): Boolean {
		elements.forEach { attachGamepad(it) }
		return list.addAll(index, elements)
	}

	/**
	 * calling next at the last position will cause this layering system to wrap back around to the first position
	 */
	override fun next() {
		layer++
		layer %= size
		layer = layer.coerceIn(0 until size)
	}

	/**
	 * calling next at the first position will cause this layering system to wrap back around to the last position
	 */
	override fun previous() {
		layer--
		layer %= size
		if (layer < 0) layer += size
		layer = layer.coerceIn(0 until size)
	}

	override var gamepad: PasteurizedGamepad?
		get() { return this.getOrNull(layer) }
		set(value) {
			if (layer in 0 until size && value != null) {
				attachGamepad(value)
				this[layer] = value
			}
		}

	override var layer: Int = 0
}