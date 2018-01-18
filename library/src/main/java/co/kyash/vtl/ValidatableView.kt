package co.kyash.vtl

import co.kyash.vtl.validators.VtlValidator
import io.reactivex.Completable

interface ValidatableView {

    fun validate(): Boolean

    fun validateAsCompletable(): Completable

    fun register(validator: VtlValidator): ValidatableView

    fun register(validators: List<VtlValidator>): ValidatableView

    fun clearValidators()
}