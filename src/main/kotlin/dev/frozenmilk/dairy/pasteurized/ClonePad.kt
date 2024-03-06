package dev.frozenmilk.dairy.pasteurized

import dev.frozenmilk.dairy.core.util.supplier.logical.IEnhancedBooleanSupplier
import dev.frozenmilk.dairy.core.util.supplier.numeric.IEnhancedNumericSupplier

class ClonePad<N: IEnhancedNumericSupplier<Double>, B: IEnhancedBooleanSupplier>(pasteurizedGamepad: PasteurizedGamepad<N, B>) : PasteurizedGamepad<N, B> by pasteurizedGamepad
