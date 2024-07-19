class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Count total frequency, O(n) 
        int[] frequency = new int[26];
        for(char id : tasks) {
            int i = id-'A';
            frequency[i]++;
        }

        // Initialize a priority queue with largest element first
        PriorityQueue<Task> priorityQ = new PriorityQueue<>((p1,p2)->p2.frequency-p1.frequency);


        // Add tasks that has a frequency of > 0 to priority queue
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] != 0) {
                priorityQ.add(new Task((char)('A'+i),frequency[i],0));
            }
        }

        Queue<Task> cdQ = new ArrayDeque<>();
        int timeStep = 0;
        while(!priorityQ.isEmpty() || !cdQ.isEmpty()) {
            // Add task from cooldown queue back into priority queue
            if(!cdQ.isEmpty()) {
                if(cdQ.peek().cd <= timeStep) {
                    priorityQ.add(cdQ.poll());
                }
            }

            // Execute task from priority queue and put them in cooldown 
            if(!priorityQ.isEmpty()) {
                Task task = priorityQ.poll();
                if(task.frequency != 0) {
                    // Send the task into the cooldown queue
                    // If it's not the last task of it's type
                    if(task.frequency > 1 ) {
                        task.cd = timeStep + n + 1;
                        cdQ.add(task);
                    }
                    task.frequency--;
                    timeStep++;
                }
            }
            // Idle, since there's nothing available to do
            else {
                timeStep++;
            }
        }
        return timeStep;
    }
}


class Task{
    char id;
    int frequency;
    int cd;
    public Task(char id, int frequency, int cd) {
        this.id = id;
        this.frequency = frequency;
        this.cd = cd;
    }
}
