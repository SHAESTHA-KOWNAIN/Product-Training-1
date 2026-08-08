import java.util.*;
public class App {
    static ArrayList<Customer> cusList=new ArrayList<>();
    static ArrayList<Task> taskList=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        int loginChoice;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("*********************Welcome to ToDo List Application**********************");
        System.out.println("1. Admin\n2. Customer\n3. Exit\n Select the login option");
        loginChoice =sc.nextInt();
        switch(loginChoice){
            case 1:
                System.out.println("**********************Welcome Admin**********************");
                System.out.println("Enter username");
                String usname=sc.next();
                System.out.println("Enter password");
                String pwd=sc.next();
                if(usname.equals("admin") && pwd.equals("admin@123")) {
                    System.out.println("Login successful!");
                    int adminoption=0;
                    while(adminoption!=5){
                    System.out.println("1. Add Customer\n2. Update Customer\n3. View Customer\n4. Delete Customer\n5. Exit\n Select the option");
                    adminoption=sc.nextInt();
                    
                    switch(adminoption){
                        case 1:
                            System.out.println("Enter customer id");
                            int cid=sc.nextInt();
                            System.out.println("Enter customer name");
                            String cname=sc.next();
                            System.out.println("Enter username");
                            String username=sc.next();
                            System.out.println("Enter password");
                            String password=sc.next();
                            Customer c=new Customer();
                            c.setCid(cid);
                            c.setCname(cname);
                            c.setUsername(username);
                            c.setPassword(password);
                            cusList.add(c);
                            System.out.println("Customer added successfully!");
                            break;
                        case 2:
                            System.out.println("Enter customer id to update");
                            int updateId=sc.nextInt();
                            for(Customer cust:cusList){
                                if(cust.getCid()==updateId){
                                    System.out.println("Enter new customer name");
                                    String newCname=sc.next();
                                    cust.setCname(newCname);
                                    System.out.println("Customer name updated successfully!");
                                    System.out.println("Enter new customer username");
                                    String newUsername=sc.next();
                                    cust.setUsername(newUsername);
                                    System.out.println("Customer username updated successfully!");
                                    System.out.println("Enter new customer password");
                                    String newPassword=sc.next();
                                    cust.setPassword(newPassword);
                                    System.out.println("Customer password updated successfully!");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter customer id to view");
                            int viewId=sc.nextInt();
                            for(Customer cust:cusList){
                                if(cust.getCid()==viewId){
                                    System.out.println("ID: "+cust.getCid()+" Name: "+cust.getCname()+" Username: "+cust.getUsername()+" Password: "+cust.getPassword());
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Enter customer id to delete");
                            int deleteId=sc.nextInt();
                            for(Customer cust:cusList){
                                if(cust.getCid()==deleteId){
                                    cusList.remove(cust);
                                    System.out.println("Customer deleted successfully!");
                                    break;
                                }
                            }
                            System.out.println("Customer deleted successfully!");
                            break;
                    }
                    }
                }
                else{
                    System.out.println("Invalid username or password");
                }
                break;
            case 2:
                System.out.println("**********************Welcome Customer**********************");
                System.out.println("Enter username");
                String CusUserName=sc.next();
                System.out.println("Enter password");
                String cusPwd=sc.next();
                for(Customer cust:cusList){
                    if(cust.getUsername().equals(CusUserName) && cust.getPassword().equals(cusPwd)){
                        System.out.println("Login successful!");
                        int taskchoice=0;
                        while(taskchoice!=5){
                        System.out.println("1. Add Tasks\n2. Delete Tasks\n 3.Update Tasks \n4.view Tasks \n5.Exit \nSelect the option");
                        taskchoice=sc.nextInt();
                        switch(taskchoice){
                            case 1:
                                System.out.println("Enter task id:");
                                int tid=sc.nextInt();
                                System.out.println("Enter task name:");
                                String tname=sc.next();
                                System.out.println("Enter task description:");
                                String tdesc=sc.next();
                                System.out.println("Enter task status:");
                                String tstatus=sc.next();
                                System.out.print("Enter created by:");
                                String createdBy=sc.next();
                                Task t=new Task();  
                                t.setTid(tid);
                                t.setTname(tname);
                                t.setTdesc(tdesc);
                                t.setTstatus(tstatus);
                                t.setCreatedBy(createdBy);
                                taskList.add(t);
                                System.out.println("Task added successfully!");
                                break;
                            case 2:
                                System.out.println("enter task id u want to delete:");
                                int deleteId=sc.nextInt();
                                for(Task t2:taskList){
                                    if(t2.getTid()==deleteId){
                                        taskList.remove(t2);
                                        System.out.println("Task deleted successfully!");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Enter task id to update");
                                int updateId=sc.nextInt();
                                for(Task t3:taskList){
                                    if(t3.getTid()==updateId){
                                        System.out.println("Enter new task name");
                                        String newTname=sc.next();
                                        t3.setTname(newTname);
                                        System.out.println("Task name updated successfully!");
                                        System.out.println("Enter new task description");
                                        String newTdesc=sc.next();
                                        t3.setTdesc(newTdesc);
                                        System.out.println("Task description updated successfully!");
                                        System.out.println("Enter new task status");
                                        String newTstatus=sc.next();
                                        t3.setTstatus(newTstatus);
                                        System.out.println("Task status updated successfully!");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Enter task id to view");
                                int viewId=sc.nextInt();
                                for(Task t4:taskList){
                                    if(t4.getTid()==viewId){
                                        System.out.println("ID: "+t4.getTid()+" Name: "+t4.getTname()+" Description: "+t4.getTdesc()+" Status: "+t4.getTstatus()+" Created By: "+t4.getCreatedBy());
                                    }
                                }
                                break;
                            }
                        }
                    }
                    
                }
            }
        }
        while(loginChoice!=3);
    }
}
