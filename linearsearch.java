class linearsearch
{
    static void ls(int arr[] , int target)
    {
        int i;
        if(arr.length==0)
        {
            System.out.println("Empty Array !");
        }
        else
        {
            for(i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    System.out.println("Found target at index : "+i);
                    break;
                }
              
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,6,56,43,69,89};

        ls(arr,56);
        
    }
}