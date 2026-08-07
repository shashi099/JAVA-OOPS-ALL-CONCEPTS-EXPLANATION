
class Demo1
{
    public static void main(String[] args) 
    {
        Status obj = Status.Running;  // we can direct call the object of the enum 
        System.out.println(obj);

        Status[] objAll = Status.values();  // It returns all the object of enum

        for(Status s : objAll)
        {
            System.out.println(s + " : " + s.ordinal());  // ordinal method provide the index of the object
        }

    }
}

enum Status
{
    Pending, Failed, Sucess, Running;       // these are the object of the enum Status
}