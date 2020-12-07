import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for(int i = 0; i < data.length; i++){
      data[i] = otherseq.next();
    }
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
  public boolean hasNext(){
    return currentIndex != data.length - 1;
  }
  public void reset(){
    currentIndex = 0;
  }
}
