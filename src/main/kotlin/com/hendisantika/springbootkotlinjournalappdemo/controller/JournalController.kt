package com.hendisantika.springbootkotlinjournalappdemo.controller

import com.hendisantika.springbootkotlinjournalappdemo.model.Journal
import com.hendisantika.springbootkotlinjournalappdemo.repository.JournalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-journal-app-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/02/20
 * Time: 06.21
 */
@RestController
@RequestMapping("/api")
class JournalController(@Autowired private val journalRepository: JournalRepository) {
    //gets all journals
    @GetMapping("/journals")
    fun getAllJournals(): List<Journal> = journalRepository.findAll()

    //creates a journal
    @PostMapping("/journals")
    fun createJournal(@Valid @RequestBody journal: Journal): Journal = journalRepository.save(journal)

}