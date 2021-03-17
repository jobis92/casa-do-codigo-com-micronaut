package br.com.zup.autores

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.management.Query

import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.*
import kotlin.annotation.AnnotationTarget.*

//@MustBeDocumented
//@Target(FIELD, CONSTRUCTOR)
//@Retention(RUNTIME)
//@Constraint(validatedBy = [EmailRepetidoValidator::class])
//annotation class EmailUnico(
//    val message: String = "Email repetido"
//)
//
//class EmailRepetidoValidator : ConstraintValidator<EmailUnico,String> {
//
//    override fun isValid(
//
//        value: String?,
//        annotationMetadata: AnnotationValue<EmailUnico>,
//        context: ConstraintValidatorContext
//    ): Boolean {
//
//
//    }
//
//}

