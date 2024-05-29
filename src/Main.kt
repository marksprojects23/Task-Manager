// Main.kt
// Mark Cuizon
fun main() {                                                        // Main.
    val taskManager = TaskManager()                                 // We create a task manager with our class.
    while (true){                                                   // This is an ongoing program, so it keeps going.
        println("1. Add Task")                                      // For this console
        println("2. Remove Task")                                   // application, we
        println("3. List Tasks")                                    // print out
        println("4. Mark Task as Complete")                         // the int
        println("5. Exit")                                          // options for
        print("Enter your choice: ")                                // the user.
        when (readLine()?.toIntOrNull()){                           // This reads the user's input into integer.
            1 -> {                                                  // If 1,
                print("Enter task description: ")                   // prompt the user for a description
                val description = readLine() ?: ""                  // where it will be read,
                taskManager.addTask(description)                    // and then stored with TaskManager's addTask()
            }                                                       // .
            2 -> {                                                  // If 2,
                print("Enter task id to remove: ")                  // prompt the user for an id to remove
                val id = readLine()?.toIntOrNull() ?: -1            // where it will be read into an int
                taskManager.removeTask(id)                          // to be used in TaskManager's removeTask()
            }                                                       // .
            3 -> taskManager.listTasks()                            // If 3, list all tasks.
            4 -> {                                                  // If 4,
                print("Enter task id to mark as complete: ")        // prompt the user for an id to mark as complete
                val id = readLine()?.toIntOrNull() ?: -1            // where it will be read into an int
                taskManager.markTaskComplete(id)                    // to be used in TaskManager's markTaskComplete()
            }                                                       // .
            5 -> {                                                  // If 5,
                println("Exiting...")                               // we exit
                break                                               // and end the while loop
            }                                                       // .
            else -> println("Invalid choice. Please try again.")    // Exception handling
        }                                                           // .
        println()                                                   // Blank line
    }                                                               // .
}
