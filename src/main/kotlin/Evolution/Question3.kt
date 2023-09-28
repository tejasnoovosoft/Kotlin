data class GameStats(var id: Int, var username: String, var level: Int, var score: Int)

fun evaluateStats(stats: List<GameStats?>) {
    val result = HashMap<String, Int>()
    stats.forEach { user ->
        if (user != null) {
            val currentScore = result[user.username] ?: 0 // Default to 0 if username is not found
            val latestScore: Int = if (user.level == 2) {
                (currentScore + user.score) / user.level
            } else {
                ((currentScore * (user.level - 1)) + user.score) / user.level
            }
            result[user.username] = latestScore
        }
    }
    println(result)
}


fun main() {
    val stats = listOf(
        GameStats(1, "XYZ", 1, 100),
        GameStats(2, "ABC", 1, 200),
        GameStats(3, "ABC", 2, 200),
        GameStats(4, "ABC", 3, 200),
        GameStats(5, "XYZ", 2, 150),
        GameStats(6, "QQQ", 1, 250),
        GameStats(7, "QQQ", 2, 100),
    )
    evaluateStats(stats)
}