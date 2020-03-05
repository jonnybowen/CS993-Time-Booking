public class Admin extends Actor {
    public Admin()
    {
        super();
    }

    public Admin(int staffNo,String firstName,String secondName,String userName,String password, String email)
    {
        super(staffNo,firstName,secondName,userName,password,email);
    }

    public Project createProject()
    {
        Project myProject = new Project();
        return myProject;
    }

    public void deleteProject(Project myProject)
    { }

    public Task createTask()
    {
        Task myTask = new Task();
        return myTask;
    }

    public void assignUser(User myUser,Project myProject,Task myTask)
    { }

    public Actor createActor(String type)
    {
        Actor myNewActor;
        if (type.equals("Admin"))
        {
            myNewActor = new Admin();
        }
        else if (type.equals("User"))
        {
            myNewActor = new User();
        }
        else
        {
            myNewActor = null;
        }
        return myNewActor;
    }

    public void deleteActor(Actor myActor)
    {}
}
