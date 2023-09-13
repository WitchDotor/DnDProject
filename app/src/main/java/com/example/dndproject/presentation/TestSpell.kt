package com.example.dndproject.presentation

import com.example.dndproject.presentation.model.SpellDisplayModeL



    private val spellDesc =
        "You draw the moisture from every creature in a 30-foot cube centered on a point you choose within range. Each creature in that area must make a Constitution saving throw. Constructs and undead aren’t affected, and plants and water elementals make this saving throw with disadvantage. A creature takes 12d8 necrotic damage on a failed save, or half as much damage on a successful one."
    private val spellOnHigherLEvel =
        "When you cast this spell using a spell slot of 3rd level or higher, the damage (both initial and later) increases by 1d4 for each slot level above 2nd."
     val testSpell = SpellDisplayModeL(
        index = "test-spell",
        name = "Test spell",
        url = "--",
        desc = spellDesc,
        higherLevel = spellOnHigherLEvel,
        range = "60f",
        components = listOf("v", "s"),
        attackType = "fire",
        castingTime = "1 action",
        concentration = true,
        duration = "instant",
        level = "1",
        material = "material",
        ritual = false
    )
    val testAOE = SpellDisplayModeL.AreaOFEffectModel(5, "sphere")
