package com.ptah.entity.accounting

import com.ptah.common.BaseEntity
import com.ptah.entity.contract.Participant
import jakarta.persistence.Entity
import jakarta.persistence.OneToOne
import java.math.BigDecimal


@Entity
class Account : BaseEntity() {
    var  name: String? = null
    var  balance: BigDecimal? = null

    @OneToOne
    var  accountOwner: Participant? = null
}