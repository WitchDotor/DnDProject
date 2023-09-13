package com.example.dndproject.domain.use_cases

import com.example.dndproject.domain.repository.DnDRepository

class UploadSpellsToLocalStorageUseCase(
    private val repository: DnDRepository
) {
    operator fun invoke() = repository.uploadSpellsToLocalStorage()
}