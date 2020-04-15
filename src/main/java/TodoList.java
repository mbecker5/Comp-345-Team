import java.util.*;

public class TodoList {

        int taskCount;
        //List<Task> toDoList;
        Collection<Task> toDoList;


        public TodoList(){
            this.taskCount = 0;
            this.toDoList = new PriorityQueue<>();

        }

        public void addTask(Task taskIn) {
            this.taskCount += 1;
            toDoList.add(taskIn);
        }

        public void removeTask(Task taskToRemove) {
            this.taskCount -= 1;
            toDoList.remove(taskToRemove);
        }



        public String getToDoList() {
            Iterator itr = toDoList.iterator();
            int i  = 1;

            String totalList = "";
//            for (int i = 0; i < taskCount; i++) {
//                totalList += (i + 1) + ". " + toDoList.get(i).getTask() + "\n";
//            }
            while(itr.hasNext()){
                Object o = itr.next();
                Task t = (Task) o; //cast as Task
                totalList += (i) + ". " + t.getTask() + "\n";
                i++;

            }

            return totalList;
        }
}