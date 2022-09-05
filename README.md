# launchModes

Standard
	--add new instance every time in task
  
Single Top
	--add new instance if not present on top of stack otherwise routes to prev instance
  
Single Instance
	--create new task which contains only one instance
  
Single Task
	--create new instance if not present
	--if present on top routes to it
	--if present in task pop tasks above it an than routes to it
  
	
Control of task shifts when one instance of activity is present in that task or when all instances are poppedd out of the current task.
