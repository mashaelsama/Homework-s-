fun main() {
    val todo = ToDo()
    val t1 = Task(1,"Mashael", "Buy a Car", true)
    val t2 = Task(2,"Abdulrahman", "Travel to NewYork", false)
    val t3 = Task(3,"Sara", "Sell My Cat", false)


    todo.addTask(t1)
    todo.addTask(t2)
    todo.addTask(t3)

    todo.showAllTasks(t2)

    todo.removeTask(t2)

    todo.changeTask(t3)

    println("All Tasks: ")
    for (task in todo.tasks)
        println("Task: ${task.note}")






}
data class Task(val id: Int, val name: String, var note: String, var isCompleted: Boolean)

class ToDo {

    val tasks = arrayListOf<Task>()

    fun addTask(task: Task) {
        println("Add Task: ${task.note}")
        tasks.add(task)
    }
    fun showAllTasks(task: Task) {
        for (task in tasks)
            println("Task Details: ID (${task.id}), Name (${task.name}), Task (${task.note}), Completed (${task.isCompleted})")

    }

    fun removeTask(task: Task) {
            println("Remove Task: ${task.note}")
            tasks.remove(task)

    }

    fun getSpecific(id: Int){

        for (task in tasks) {
            if (id == task.id)
                println(task)

        }
    }
    fun changeTask(t: Task) {
        var i = tasks.indexOf(t)
        tasks[i].isCompleted = !tasks[i].isCompleted
        println("Task: ${tasks[i].note}, Complete: ${tasks[i].isCompleted}")

        }
    }




