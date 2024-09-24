class SavingAccount(accountNumber: String, balance: Double, private val interestRate: Double): BankAccount(accountNumber= accountNumber, balance = balance){
    fun applyInterest() {
        val interest = balance * (interestRate/100)
        balance += interest
        println("Số tiền lãi là: "+ interest + ". Số dư tài khoản mới là: "+ balance)
    }
}
