// Main.kt
// Mark Cuizon
fun main() {
    val taskManager = TaskManager()
    while (true){
        println("1. Add Task")
        println("2. Remove Task")
        println("3. List Tasks")
        println("4. Mark Task as Complete")
        println("5. Exit")
        print("Enter your choice: ")
        when (readLine()?.toIntOrNull()){
            1 -> {
                print("Enter task description: ")
                val description = readLine() ?: ""
                taskManager.addTask(description)
            }
            2 -> {
                print("Enter task id to remove: ")
                val id = readLine()?.toIntOrNull() ?: -1
                taskManager.removeTask(id)
            }
            3 -> taskManager.listTasks()
            4 -> {
                print("Enter task id to mark as complete: ")
                val id = readLine()?.toIntOrNull() ?: -1
                taskManager.markTaskComplete(id)
            }
            5 -> {
                println("Exiting...")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
        println()
    }
}
