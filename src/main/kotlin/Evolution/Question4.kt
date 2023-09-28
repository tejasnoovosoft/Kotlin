data class Users(val acc_id: Int, val name: String, var current_balance: Int)

data class BankTransactions(val acc_id: Int, val date: String, val amount: Int, val type: String)

fun processTransactions(users: List<Users?>, bank_transactions: List<BankTransactions?>) {
    bank_transactions.forEach { transaction ->
        val user = users.find { it?.acc_id == transaction?.acc_id }
        if (user != null) {
            when (transaction?.type) {
                "Debit" -> user.current_balance = (user.current_balance ?: 0) - (transaction.amount ?: 0)
                "Credit" -> user.current_balance = (user.current_balance ?: 0) + (transaction.amount ?: 0)
            }
        }
    }
}


fun main() {
    val users = listOf(
        Users(101, "Bob", 24000), Users(102, "Alice", 30000), Users(105, "Arjun", 35000)
    )

    val bank_transactions = listOf(
        BankTransactions(101, "12/10/2020 03:00", 2000, "Debit"),
        BankTransactions(102, "15/10/2020 03:00", 200, "Debit"),
        BankTransactions(101, "15/10/2002 13:00", 5000, "Credit"),
        BankTransactions(105, "20/10/2002 3:00", 2000, "Credit"),
    )

    processTransactions(users, bank_transactions)
    println(users)
}