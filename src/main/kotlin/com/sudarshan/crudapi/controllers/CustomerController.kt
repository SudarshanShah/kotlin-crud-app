package com.sudarshan.crudapi.controllers

import com.sudarshan.crudapi.services.CustomerService
import com.sudarshan.crudapi.models.Customer
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun getAll(): ResponseEntity<List<Customer>> {
        return ResponseEntity(customerService.getAll(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): ResponseEntity<Customer> {
        return ResponseEntity(customerService.get(id), HttpStatus.OK)
    }

    @PostMapping
    fun add(@RequestBody customer: Customer): ResponseEntity<Customer> {
        return ResponseEntity(customerService.add(customer), HttpStatus.CREATED)
    }
}