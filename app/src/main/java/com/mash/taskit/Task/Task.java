package com.mash.taskit.Task;


import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Task
{
    protected String name;
    protected String description;

    protected TaskCategory category = TaskCategory.TC_MISC;

    protected LocalDateTime startTime;
    protected LocalDateTime deadline;

    protected Priority priority = Priority.P_NONE;

    public Task(LocalDateTime start, LocalDateTime deadline)
    {
        startTime = start;
        this.deadline = deadline;
    }


    public int DaysUntilDeadline()
    {
        int startDays = startTime.getYear() % 4 == 0 ? 366 : 365;

        int totalDays = startDays - startTime.getDayOfYear() + deadline.getDayOfYear();

        return totalDays;
    }


    String ToString()
    {
        String output = "";

        return output;
    }


}
