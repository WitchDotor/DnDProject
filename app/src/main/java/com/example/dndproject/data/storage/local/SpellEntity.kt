package com.example.dndproject.data.storage.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SpellEntity (

    @ColumnInfo("index") @PrimaryKey val index: String,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("desc") val desc: String,
    @ColumnInfo("higher_level") val higherLevel: String,
    @ColumnInfo("range") val range: String,
    @ColumnInfo("components") val components: List<String>,
    @ColumnInfo("material") val material: String,
    @ColumnInfo("area_of_effect") val areaOfEffectEntity: AreaOFEffectEntity,
    @ColumnInfo("ritual") val ritual: Boolean,
    @ColumnInfo("duration") val duration: String,
    @ColumnInfo("concentration") val concentration: Boolean,
    @ColumnInfo("casting_time") val castingTime: String,
    @ColumnInfo("level") val level: String,
    @ColumnInfo("attack_type") val attackType: String,
    @ColumnInfo("schoolModel") val schoolEntity: SchoolEntity,
    @ColumnInfo("classesModel") val classesEntity: ClassesEntity,
    @ColumnInfo("subclasses") val subClasses: SubclassesEntity

    ) {
    data class AreaOFEffectEntity(
        @ColumnInfo("size") val size: Int,
        @ColumnInfo("type") val type: String
    )

    data class AttackDamageTypeEntity(
        @ColumnInfo("name") val name: String
    )

    data class DamageEntity(
        @ColumnInfo("damage_at_character_level") val damageAtCharacterLevel: Map<Any, Any>,
        @ColumnInfo("damage_type") val damageType: AttackDamageTypeEntity
    )

    data class SchoolEntity(
        @ColumnInfo("name") val name: String
    )

    data class ClassesEntity(
        @ColumnInfo("name") val name: String
    )

    data class SubclassesEntity(
        @ColumnInfo("name") val name: String
    )
}