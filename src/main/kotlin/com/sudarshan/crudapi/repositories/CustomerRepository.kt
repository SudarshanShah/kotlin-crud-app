package com.sudarshan.crudapi.repositories

import com.sudarshan.crudapi.models.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Int> {
}