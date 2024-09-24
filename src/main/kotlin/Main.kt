fun main(args: Array<String>) {
    val customer = Customer("Trang")

    val savings = SavingAccount("0364075592", 100000000.0, 4.8)
    val checking = CheckingAccount("0364075592", 5000000000.0, 2.1)

    customer.addAccount(savings)
    customer.addAccount(checking)

    customer.displayAccounts()

    savings.applyInterest()
    checking.withdraw(1000000.0)

    customer.displayAccounts()

}