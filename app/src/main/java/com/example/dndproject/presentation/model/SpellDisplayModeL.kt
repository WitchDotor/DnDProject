package com.example.dndproject.presentation.model

import com.google.gson.annotations.SerializedName

data class SpellDisplayModeL(
    val index: String,
    val name: String,
    val url: String,
    val desc: String,
    val higherLevel: String,
    val range: String,
    val components: List<String>,
    val material: String,
//    val areaOfEffect: AreaOFEffectModel,
    val ritual: Boolean,
    val duration: String,
    val concentration: Boolean,
    val castingTime: String,
    val level: String,
    val attackType: String,
//    val schoolModel: SchoolModel,
//    val classesModel: ClassesModel,
//    val subClasses: SubclassesModel

) {
    data class AreaOFEffectModel(
       val size: Int,
       val type: String
    )

    data class AttackDamageTypeModel(
        val name: String
    )

    data class DamageModel(
        val damageAtCharacterLevel: Map<Any, Any>,
         val damageType: AttackDamageTypeModel
    )

    data class SchoolModel(
        val name: String
    )

    data class ClassesModel(
         val name: String
    )

    data class SubclassesModel(
      val name: String
    )
}