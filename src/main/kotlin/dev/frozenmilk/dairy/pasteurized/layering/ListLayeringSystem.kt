package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier
import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

class ListLayeringSystem (private val list: MutableList<PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>>) : IncrementingLayeringSystem<Int> {
	init {
		list.forEach {
			attachGamepad(it)
		}
	}

	/**
	 * calling next at the last position will not cause this layering system to change
	 */
	override fun next() {
		layer++
		layer = layer.coerceIn(0 until list.size)
	}

	/**
	 * calling next at the first position will not cause this layering system to change
	 */
	override fun previous() {
		layer--
		layer = layer.coerceIn(0 until list.size)
	}

	override var gamepad: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?
		get() { return list.getOrNull(layer) }
		set(value) {
			if (layer in 0 until list.size && value != null) {
				attachGamepad(value)
				list[layer] = value
			}
		}

	override var layer: Int = 0
}