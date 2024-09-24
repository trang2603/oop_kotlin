open class BankAccount(var accountNumber: String, var balance: Double) {
    open fun deposit(amout: Double) {
        if(amout>0) {
            balance += amout
            println("Số tiền đã gửi là: "+ amout + ". Số dư mới của tài khoản là: "+ balance)
        }
        else {
            println("Số tiền đã gửi phải lơớn hơn không")
        }
    }

    open fun withdraw(amout: Double) {
        if(amout > 0 && amout <= balance) {
            balance -= amout
            println("Số tiền đã rút là: "+ amout + ". Số dư tài khoản là: "+ balance);
        }
        else println("Số tiền không hợp lệ")
    }
    open fun displayBalance(){
        println("Số tài khoản của bạn là: "+ accountNumber + ", số dư tài khoản là: "+ balance )
    }

}