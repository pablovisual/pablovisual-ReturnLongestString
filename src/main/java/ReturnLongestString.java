
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String longString = new String();
        int counter = 0;
        return longestString(arr, counter, longString);
    }

    public String longestString(String[] arr, int counter, String longString) {
        if (arr.length == 0 || arr.length == 1) {
            longString = arr.length == 0 ? "" : arr[counter];
            return longString;
        }
            
        if(counter == arr.length)
            return longString;
        
        else if(longString.length() < arr[counter].length())
            longString = arr[counter];
        
        return longestString(arr, ++counter, longString);
    }
}
