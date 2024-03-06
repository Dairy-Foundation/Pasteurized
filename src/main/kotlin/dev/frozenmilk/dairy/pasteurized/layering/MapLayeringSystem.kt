package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier
import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

open class MapLayeringSystem<KEY> (startingLayer: KEY, private val map: MutableMap<KEY, PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?>) : LayeringSystem<KEY>, MutableMap<KEY, PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?> by map {
	init {
		mapNotNull { it.value }.forEach { attachGamepad(it) }
	}

	override fun put(key: KEY, value: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?): PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>? {
		value?.let { attachGamepad(value) }
		return map.put(key, value)
	}

	override fun putAll(from: Map<out KEY, PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?>) {
		from.mapNotNull { it.value }.forEach { attachGamepad(it) }
		return map.putAll(from)
	}

	override var gamepad: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>?
		get() { return this[layer] }
		set(value) {
			this[layer] = value
		}

	override var layer = startingLayer
}
