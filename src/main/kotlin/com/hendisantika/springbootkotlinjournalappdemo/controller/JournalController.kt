package com.hendisantika.springbootkotlinjournalappdemo.controller

import com.hendisantika.springbootkotlinjournalappdemo.repository.JournalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
class JournalController(@Autowired private val journalRepository: JournalRepository)