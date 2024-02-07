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
	@get:JvmName("gamepad1")
	@set:JvmName("gamepad1")
	var gamepad1: PasteurizedGamepad by gamepad1Cell

	private var gamepad2Cell: LazyCell<PasteurizedGamepad> = LazyCell {
		SDKGamepad (
				FeatureRegistrar.activeOpModeWrapper?.opMode?.gamepad2 ?: throw IllegalStateException("OpMode not inited, cannot yet access gamepad2")
		)
	}

	@JvmStatic
	@get:JvmName("gamepad2")
	@set:JvmName("gamepad2")
	var gamepad2: PasteurizedGamepad by gamepad2Cell

	override fun postUserStopHook(opMode: Wrapper) {
		gamepad1Cell.invalidate()
		gamepad2Cell.invalidate()
	}
}