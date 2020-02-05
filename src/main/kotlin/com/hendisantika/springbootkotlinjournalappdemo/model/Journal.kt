package com.hendisantika.springbootkotlinjournalappdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-journal-app-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/02/20
 * Time: 06.09
 */
@Entity(name = "journals")
data class Journal(
        @Id @GeneratedValue(
                strategy = GenerationType.Identity) val id: Long = 0,
        @get: NotBlank val title: String = "",
        @get: NotBlank val content: String = "")