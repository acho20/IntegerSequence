import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public int next(){
    try{
      currentIndex++;
      return currentIndex - 1;
    }catch (NoSuchElementException e){
      throw(e);
    }
  }
}
