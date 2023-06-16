package com.sudarshan.crudapi.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "customers")
data class Customer(@Id var id: Int,
                    @NotBlank var name: String,
                    @NotBlank var city: String)
