

public class QF {
    int[] array;

    // this function is used to create an array
    // for a specific length (input)
    public int[] fillArray(int len) {
        array = new int[len];
        for (int i = 0; i < len; i++)
            array[i] = i;
        return array;
    }

    // this function checks if two points are connected
    public Boolean Connected(int pointA, int pointB) {
        return array[pointA] == array[pointB];
    }
    // this function union two point by changing making their
    // index unique 
    public void union(int pointA, int pointB) {
        // here we are declaring these vars because
        // the value of array[pointA or pointB] may change 
        // so we are storing it to use the same value 
        // that won't change even  
        int pointBid = array[pointB];
        int pointAid = array[pointA];
        // here we are making the indexes of each element 
        // that have the same value of pointBid = pointAid
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pointAid ) {
                array[i] =  pointBid;
            }
        }
    }
    // that's a simple function to print each index with 
    // it's value
    public void printArray() {
        for (int i = 0; i < array.length; i++)
            System.out.println(i + " = " + array[i]);
        System.out.println("---------------------------------------------------");
    }

}
