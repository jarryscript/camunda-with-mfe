package com.ptah.common.exceptions

import com.ptah.common.Errors

class SystemException(error: Errors) : CommonException(error.code + " : " + error.message)
