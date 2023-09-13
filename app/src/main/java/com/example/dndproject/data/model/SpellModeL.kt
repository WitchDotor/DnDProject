package com.example.dndproject.data.model

import com.google.gson.annotations.SerializedName

data class SpellModeL(
    @SerializedName("index") val index: String,
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
    @SerializedName("desc") val desc: String,
    @SerializedName("higher_level") val higherLevel: String,
    @SerializedName("range") val range: String,
    @SerializedName("components") val components: List<String>,
    @SerializedName("material") val material: String,
    @SerializedName("area_of_effect") val areaOfEffect: AreaOFEffectModel,
    @SerializedName("ritual") val ritual: Boolean,
    @SerializedName("duration") val duration: String,
    @SerializedName("concentration") val concentration: Boolean,
    @SerializedName("casting_time") val castingTime: String,
    @SerializedName("level") val level: String,
    @SerializedName("attack_type") val attackType: String,
    @SerializedName("schoolModel") val schoolModel: SchoolModel,
    @SerializedName("classesModel") val classesModel: ClassesModel,
    @SerializedName("subclasses") val subClasses: SubclassesModel

) {
    data class AreaOFEffectModel(
        @SerializedName("size") val size: Int,
        @SerializedName("type") val type: String
    )

    data class AttackDamageTypeModel(
        @SerializedName("name") val name: String
    )

    data class DamageModel(
        @SerializedName("damage_at_character_level") val damageAtCharacterLevel: Map<Any, Any>,
        @SerializedName("damage_type") val damageType: AttackDamageTypeModel
    )

    data class SchoolModel(
        @SerializedName("name") val name: String
    )

    data class ClassesModel(
        @SerializedName("name") val name: String
    )

    data class SubclassesModel(
        @SerializedName("name") val name: String
    )
}