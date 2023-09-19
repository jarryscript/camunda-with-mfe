package com.ptah.repository.userprofiling

import com.ptah.entity.userprofiling.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User?, Long?> {
    fun findByLogin(login: String?): User?
}