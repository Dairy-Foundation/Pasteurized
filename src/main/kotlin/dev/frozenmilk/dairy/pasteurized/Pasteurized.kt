package dev.frozenmilk.dairy.pasteurized

import dev.frozenmilk.dairy.core.Feature
import dev.frozenmilk.dairy.core.FeatureRegistrar
import dev.frozenmilk.dairy.core.dependencyresolution.dependencyset.DependencySet
import dev.frozenmilk.dairy.core.wrapper.Wrapper
import dev.frozenmilk.util.cell.LazyCell

object Pasteurized : Feature {
	override val dependencies = DependencySet(this)
			.yields()

	private var gamepad1Cell: LazyCell<PasteurizedGamepad> = LazyCell {
		SDKGamepad (
				FeatureRegistrar.activeOpModeWrapper?.opMode?.gamepad1 ?: throw IllegalStateException("OpMode not inited, cannot yet access gamepad1")
		)
	}

	@JvmStatic
	var gamepad1: PasteurizedGamepad
		get() { return gamepad1Cell.get() }
		set(value) { gamepad1Cell.accept(value) }

	private var gamepad2Cell: LazyCell<PasteurizedGamepad> = LazyCell {
		SDKGamepad (
				FeatureRegistrar.activeOpModeWrapper?.opMode?.gamepad2 ?: throw IllegalStateException("OpMode not inited, cannot yet access gamepad2")
		)
	}

	@JvmStatic
	var gamepad2: PasteurizedGamepad
		get() { return gamepad2Cell.get() }
		set(value) { gamepad2Cell.accept(value) }

	override fun postUserStopHook(opMode: Wrapper) {
		gamepad1Cell.invalidate()
		gamepad2Cell.invalidate()
	}
}