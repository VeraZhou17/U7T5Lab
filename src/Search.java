import java.util.ArrayList;

public class Search
{
    // A. write a static method named linearSearch that returns the first index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)
    public static int linearSearch(int target, int[] nums)
    {
        int i = 0;
        while (i < nums.length)
        {
            if (nums[i] == target)
            {
                return i;
            }
            i++;
        }
        i = -1;
        return i;
    }

    // B. write a second static method that has the same parameters as linearSearch but
    // instead of returning an index, it returns true if target is found or false
    // if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN
    public static boolean linearSearchIsFound(int target, int[] nums)
    {
        int i = 0;
        while (i < nums.length)
        {
            if (nums[i] == target)
            {
                return true;
            }
            i++;
        }
        i = -1;
        return false;
    }

    // C. provide an OVERLOADED version of the linearSearch method that accepts an ArrayList
    // of Integers (rather than an array of ints) and a target int; return the first index
    // at which the target is found, or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN
    public static int linearSearch(ArrayList<Integer> nums, int target)
    {
        int i = 0;
        while (i < nums.size())
        {
            if (nums.get(i).equals(target))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    // D. provide another OVERLOADED version of the linearSearch method that accepts an array
    // of Strings and a target String; return the first index at which the target is found,
    // or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN
    public static int linearSearch(String[] str, String target)
    {
        int i = 0;
        while (i < str.length)
        {
            if (str[i].equals(target))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    // E. write a "linearSearchLast" method that accepts an array of ints and a
    // target int, and return the LAST index at which the target is found,
    // or return -1 if target is not found
    public static int linearSearchLast(int[] nums, int target)
    {
        int i = nums.length - 1;
        while (i >= 0)
        {
            if (nums[i] == target)
            {
                return i;
            }
            i--;
        }
        return -1;
    }

    // F. write two static "linearSearchCount" methods (both overloaded), one that
    // accepts an array of ints and a target int, and the other that accepts an ArrayList
    // of Integers and a target int.  Each method should return the NUMBER OF TIMES
    // the target appears in the array/ArrayList.
    public static int linearSearchCount(int[] nums, int target)
    {
        int count = 0;
        int i = 0;
        while (i < nums.length)
        {
            if (nums[i] == target)
            {
                count++;
            }
            i++;
        }
        return count;
    }

    public static int linearSearchCount(ArrayList<Integer> nums, int target)
    {
        int count = 0;
        int i = 0;
        while (i < nums.size())
        {
            if (nums.get(i) == target)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
