package com.example.dndproject.data.mapper

import com.example.dndproject.data.model.SpellModeL
import com.example.dndproject.data.storage.local.SpellEntity

class ModelToENtityMapper {

    fun mapAllModelToENtity(models: List<SpellModeL>) =
        models.map { model -> mapModelToENtity(model) }

    fun mapModelToENtity(model: SpellModeL) = SpellEntity(
        index = model.index,
        name = model.name,
        desc = model.desc,
        higherLevel = model.higherLevel,
        range = model.range,
        components = model.components,
        material = model.material,
        areaOfEffectEntity = mapModelAOEToEntity(model.areaOfEffect),
        ritual = model.ritual,
        duration = model.duration,
        concentration = model.concentration,
        castingTime = model.castingTime,
        level = model.level,
        attackType = model.attackType,
        schoolEntity = mapModelSchoolToEntity(model.schoolModel),
        classesEntity = mapModellClassesToEntity(model.classesModel),
        subClasses = mapModelSubClassesToEntity(model.subClasses)

    )

    fun mapModelAOEToEntity(model: SpellModeL.AreaOFEffectModel) = SpellEntity.AreaOFEffectEntity(
        size = model.size,
        type = model.type
    )

    fun mapModellClassesToEntity(model: SpellModeL.ClassesModel) = SpellEntity.ClassesEntity(
        name = model.name
    )

    fun mapModelSubClassesToEntity(model: SpellModeL.SubclassesModel) =
        SpellEntity.SubclassesEntity(
            name = model.name
        )

    fun mapModelSchoolToEntity(model: SpellModeL.SchoolModel) = SpellEntity.SchoolEntity(
        name = model.name
    )
}