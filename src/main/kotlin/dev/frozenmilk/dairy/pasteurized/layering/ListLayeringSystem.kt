package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

class ListLayeringSystem (private val list: MutableList<PasteurizedGamepad>) : IncrementingLayeringSystem<Int>, MutableList<PasteurizedGamepad> by list {
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
	 * calling next at the last position will not cause this layering system to change
	 */
	override fun next() {
		layer++
		layer = layer.coerceIn(0 until size)
	}

	/**
	 * calling next at the first position will not cause this layering system to change
	 */
	override fun previous() {
		layer--
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