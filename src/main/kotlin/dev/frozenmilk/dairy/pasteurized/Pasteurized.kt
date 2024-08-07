package dev.frozenmilk.dairy.pasteurized

import dev.frozenmilk.dairy.core.Feature
import dev.frozenmilk.dairy.core.FeatureRegistrar
import dev.frozenmilk.dairy.core.dependency.lazy.Yielding
import dev.frozenmilk.dairy.core.util.supplier.logical.EnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.EnhancedDoubleSupplier
import dev.frozenmilk.dairy.core.wrapper.Wrapper
import dev.frozenmilk.util.cell.LazyCell

object Pasteurized : Feature {
	override val dependency = Yielding

	private var gamepad1Cell: LazyCell<PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>> = LazyCell {
		if (!FeatureRegistrar.opModeActive) throw IllegalStateException("OpMode not inited, cannot yet access gamepad1")
		SDKGamepad (
				FeatureRegistrar.activeOpModeWrapper.opMode.gamepad1
		)
	}

	@JvmStatic
	@get:JvmName("gamepad1")
	@set:JvmName("gamepad1")
	var gamepad1: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier> by gamepad1Cell

	private var gamepad2Cell: LazyCell<PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier>> = LazyCell {
		if (!FeatureRegistrar.opModeActive) throw IllegalStateException("OpMode not inited, cannot yet access gamepad2")
		SDKGamepad (
				FeatureRegistrar.activeOpModeWrapper.opMode.gamepad2
		)
	}

	@JvmStatic
	@get:JvmName("gamepad2")
	@set:JvmName("gamepad2")
	var gamepad2: PasteurizedGamepad<EnhancedDoubleSupplier, EnhancedBooleanSupplier> by gamepad2Cell

	override fun postUserStopHook(opMode: Wrapper) {
		gamepad1Cell.invalidate()
		gamepad2Cell.invalidate()
	}
}