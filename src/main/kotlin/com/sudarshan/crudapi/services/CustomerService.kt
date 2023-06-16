package com.sudarshan.crudapi.services

import com.sudarshan.crudapi.exceptions.CustomerNotFoundException
import com.sudarshan.crudapi.models.Customer
import com.sudarshan.crudapi.repositories.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {

    fun getAll(): List<Customer> {
        return customerRepository.findAll()
    }

    fun get(id: Int): Customer {
        return customerRepository.findById(id)
                .orElseThrow { CustomerNotFoundException("Customer Not Found with id : $id") }
    }

    fun add(customer: Customer): Customer {
        return customerRepository.save(customer)
    }
}