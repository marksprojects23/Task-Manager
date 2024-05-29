// TaskManager.kt
// Mark Cuizon
class TaskManager{
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    fun addTask(description: String){
        val task = Task(nextId++, description)
        tasks.add(task)
        println("Task added: $task")
    }

    fun removeTask(id: Int){
        val task = tasks.find { it.id == id }
        if (task != null){
            tasks.remove(task)
            println("Task removed: $task")
        } else{
            println("Task not found with id: $id")
        }
    }

    fun listTasks(){
        if (tasks.isEmpty()){
            println("No tasks available.")
        } else{
            tasks.forEach { println(it) }
        }
    }

    fun markTaskComplete(id: Int){
        val task = tasks.find { it.id == id }
        if (task != null){
            task.isComplete = true
            println("Task marked as complete: $task")
        } else{
            println("Task not found with id: $id")
        }
    }
}
