class Customer(val name: String) {
    private val accounts: MutableList<BankAccount> = mutableListOf()
    fun addAccount(account: BankAccount) {
        accounts.add(account)
    }

    fun displayAccounts() {
        println("Customer: $name" )
        for(account in accounts) {
            account.displayBalance()
        }
    }
}