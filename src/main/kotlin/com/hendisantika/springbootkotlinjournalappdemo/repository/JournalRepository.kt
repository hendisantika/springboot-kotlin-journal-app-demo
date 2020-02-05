package com.hendisantika.springbootkotlinjournalappdemo.repository

import com.hendisantika.springbootkotlinjournalappdemo.model.Journal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-journal-app-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/02/20
 * Time: 06.13
 */
@Repository
interface JournalRepository : JpaRepository<Journal, Long>