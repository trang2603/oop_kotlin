class CheckingAccount(accountNumber: String, balance: Double, private val transactionFee: Double): BankAccount(accountNumber = accountNumber, balance = balance) {
    override fun withdraw(amout: Double) {
        if(amout >0 && amout+ transactionFee <= balance) {
            balance -= (amout + transactionFee)
            println("Số tiền đã rút là: "+ amout + " với phí " + transactionFee)
        }else println("Số dư tài khoản không đủ")
    }
}