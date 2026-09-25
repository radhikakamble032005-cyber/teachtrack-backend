public class Unit
{
    String unitName;
    int totalTopics;
     int completedTopics;
     double calculateProgress()
     {
        if(totalTopics ==0)
        {
            return 0;
        }
        return ( (double)completedTopics/totalTopics)*100;
     }
}