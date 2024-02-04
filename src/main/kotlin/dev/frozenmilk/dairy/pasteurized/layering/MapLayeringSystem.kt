package dev.frozenmilk.dairy.pasteurized.layering

import dev.frozenmilk.dairy.pasteurized.PasteurizedGamepad

open class MapLayeringSystem<KEY> (startingLayer: KEY, private val map: MutableMap<KEY, PasteurizedGamepad?>) : LayeringSystem<KEY>, MutableMap<KEY, PasteurizedGamepad?> by map {
	init {
		mapNotNull { it.value }.forEach { attachGamepad(it) }
	}

	override fun put(key: KEY, value: PasteurizedGamepad?): PasteurizedGamepad? {
		value?.let { attachGamepad(value) }
		return map.put(key, value)
	}

	override fun putAll(from: Map<out KEY, PasteurizedGamepad?>) {
		from.mapNotNull { it.value }.forEach { attachGamepad(it) }
		return map.putAll(from)
	}

	override var gamepad: PasteurizedGamepad?
		get() { return this[layer] }
		set(value) {
			this[layer] = value
		}

	override var layer = startingLayer
}
