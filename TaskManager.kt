// TaskManager.kt
// Mark Cuizon
class TaskManager{                                      // For encapsulation, we create a class to manage tasks.
    private val tasks = mutableListOf<Task>()           // In Kotlin, we can make mutable lists.
    private var nextId = 1                              // We will need an incrementable variable representing the id for the next incoming task.

    fun addTask(description: String){                   // To add a new task, we need its description.
        val task = Task(nextId++, description)          // A task is created with an id (that gets incremented after usage) and the user's description.
        tasks.add(task)                                 // The task gets added to the mutable list.
        println("Task added: $task")                    // Inform the user the task is added
    }                                                   // .

    fun removeTask(id: Int){                            // To remove a task, we refer to the id of the task to be removed.
        val task = tasks.find { it.id == id }           // In Kotlin, we can simply find objects in a mutable list by pinpointing a matching value of a key.
        if (task != null){                              // If the task to remove is found,
            tasks.remove(task)                          // remove the task,
            println("Task removed: $task")              // and then inform the user.
        } else{                                         // Otherwise,
            println("Task not found with id: $id")      // it isn't found
        }                                               // .
    }

    fun listTasks(){                                    // The user can also list tasks.
        if (tasks.isEmpty()){                           // If the tasks mutable list is empty,
            println("No tasks available.")              // let the user know.
        } else{                                         // Or else,
            tasks.forEach { println(it) }               // we loop through the mutable list and print them out on a per line basis
        }                                               // .
    }

    fun markTaskComplete(id: Int){                      // To mark a task as completed, we refer to the id of the task to be marked.
        val task = tasks.find { it.id == id }           // We find the object in the mutable list by finding it by value of the id key.
        if (task != null){                              // If the task exists,
            task.isComplete = true                      // set the isComplete boolean to true,
            println("Task marked as complete: $task")   // and let the user know.
        } else{                                         // Otherwise,
            println("Task not found with id: $id")      // it wasn't found
        }                                               // .
    }
}
